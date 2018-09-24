package mowede.framework.ititit.data.network

import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class TokenRenewInterceptor
@Inject constructor(private val session: Session)
    : Interceptor {

    override fun intercept(chain: Interceptor.Chain?): Response? {
        val mainResponse = chain?.proceed(chain.request())
        val token = mainResponse?.header("x-auth-token")
        token?.let{
            session.saveToken(token)
        }

        return mainResponse
    }
}