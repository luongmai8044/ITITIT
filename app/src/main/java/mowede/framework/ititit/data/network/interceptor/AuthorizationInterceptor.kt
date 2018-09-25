package mowede.framework.ititit.data.network.interceptor

import mowede.framework.ititit.data.domain.HttpCallFailureException
import mowede.framework.ititit.data.network.Session
import mowede.framework.ititit.data.network.TokenServiceHelper
import okhttp3.Interceptor
import okhttp3.Response
import java.net.HttpURLConnection
import javax.inject.Inject

class AuthorizationInterceptor
@Inject constructor(private val session: Session,
                    private val tokenServiceHelper: TokenServiceHelper,
                    private val sessionExpiredListener: SessionExpiredListener)
    : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {

        val response = getResponse(chain, session.getToken())

        return if (response.code() == HttpURLConnection.HTTP_UNAUTHORIZED
                && session.isLoggedIn()) {
            if (response.message().contains("Logged out")) {
                sessionExpiredListener.onSessionExpired()
                response
            } else {
                refreshTokenAndRepeat(chain, session.getToken()!!, response)
            }
        } else {
            response
        }
    }

    private fun refreshTokenAndRepeat(chain: Interceptor.Chain, initialToken: String, originalResponse: Response) : Response {
        synchronized(this) {

            val currentToken = session.getToken()
            val isTokenRefreshed = currentToken != initialToken

            if (isTokenRefreshed) {
                return getResponse(chain, currentToken)
            }
            val newTokenResponse = tokenServiceHelper.refreshToken().execute()
            when {
                newTokenResponse.isSuccessful -> {
                    val token = newTokenResponse.body()!!
                    session.saveToken(token.accessToken)
                    return getResponse(chain, token.accessToken)
                }
                newTokenResponse.code() == HttpURLConnection.HTTP_UNAUTHORIZED -> sessionExpiredListener.onSessionExpired()
                else -> throw HttpCallFailureException()
            }
            return originalResponse
        }
    }

    private fun getResponse(chain: Interceptor.Chain, token: String?): Response {
        val originalRequest = chain.request()
        val builder = originalRequest.newBuilder()
                .method(originalRequest.method(), originalRequest.body())

        token?.let { builder.addHeader("Authorization", "Bearer $token") }

        return chain.proceed(originalRequest)
    }

    interface SessionExpiredListener {
        fun onSessionExpired()
    }
}