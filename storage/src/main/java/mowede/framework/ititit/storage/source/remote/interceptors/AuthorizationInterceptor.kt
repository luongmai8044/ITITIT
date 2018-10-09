package mowede.framework.ititit.storage.source.remote.interceptors

import mowede.framework.ititit.exceptions.ServerException
import mowede.framework.ititit.storage.model.TokenData
import mowede.framework.ititit.storage.source.preferences.UserPreferences
import mowede.framework.ititit.storage.source.remote.api.TokenServiceHelper
import okhttp3.Interceptor
import okhttp3.Response
import java.net.HttpURLConnection
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthorizationInterceptor
@Inject constructor(private val userPreferences: UserPreferences,
                    private val tokenServiceFactory: TokenServiceHelper,
                    private val sessionExpiredListener: SessionExpiredListener)
    : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        var accessToken = userPreferences.getTokenData()?.accessToken
        val response = getResponse(chain, accessToken)

        return if (response.code() == HttpURLConnection.HTTP_UNAUTHORIZED
                && userPreferences.getTokenData() != null) {
            if (response.message().contains("Logged out")) {
                sessionExpiredListener.onSessionExpired()
                response
            } else {
                refreshTokenAndRepeat(chain, accessToken!!, response)
            }
        } else {
            response
        }
    }

    private fun refreshTokenAndRepeat(chain: Interceptor.Chain, initialToken: String, originalResponse: Response) : Response {
        synchronized(this) {

            val currentToken = userPreferences.getTokenData()?.accessToken
            val isTokenRefreshed = currentToken != initialToken

            if (isTokenRefreshed) {
                return getResponse(chain, currentToken)
            }
            val newTokenResponse = tokenServiceFactory.refreshToken().execute()
            when {
                newTokenResponse.isSuccessful -> {
                    val token = newTokenResponse.body()!!
                    userPreferences.putTokenData(TokenData(token.accessToken, token.refreshToken))
                    return getResponse(chain, token.accessToken)
                }
                newTokenResponse.code() == HttpURLConnection.HTTP_UNAUTHORIZED -> sessionExpiredListener.onSessionExpired()
                else -> throw ServerException(newTokenResponse.code().toString(), newTokenResponse.message())
            }
            return originalResponse
        }
    }

    private fun getResponse(chain: Interceptor.Chain, token: String?): Response {
        val originalRequest = chain.request()
        val builder = originalRequest.newBuilder()
                .method(originalRequest.method(), originalRequest.body())

        token?.let { builder.addHeader("Authorization", "Bearer $token") }

        return chain.proceed(builder.build())
    }

    interface SessionExpiredListener {
        fun onSessionExpired()
    }
}