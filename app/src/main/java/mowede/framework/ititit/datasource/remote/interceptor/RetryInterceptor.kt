package mowede.framework.ititit.datasource.remote.interceptor

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import javax.inject.Inject

class RetryInterceptor @Inject constructor() : Interceptor {

    companion object {
        private const val MAX_RETRIES_COUNT = 3
        private const val DELAY_BEFORE_RETRY = 2000L
    }

    override fun intercept(chain: Interceptor.Chain): Response {
        val request: Request = chain.request()
        var response: Response = chain.proceed(request)

        var retryCount = 0
        while (!response.isSuccessful && retryCount < MAX_RETRIES_COUNT) {
            Thread.sleep(DELAY_BEFORE_RETRY)
            retryCount++
            response = chain.proceed(request)
        }
        return response
    }

}