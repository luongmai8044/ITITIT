package mowede.framework.ititit.storage.source.remote.interceptors

import com.google.gson.Gson
import mowede.framework.ititit.exceptions.ServerException
import mowede.framework.ititit.exceptions.UnexpectedException
import mowede.framework.ititit.storage.entity.response.ErrorResponse
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class ErrorResponseInterceptor @Inject constructor() : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val response = chain.proceed(chain.request())
        if (!response.isSuccessful) {
            response.body()?.string()?.let {
                val gson = Gson()
                try {
                    val errorModel = gson.fromJson<ErrorResponse>(it, ErrorResponse::class.java)
                    throw ServerException(errorModel.code, errorModel.message)
                } catch (ignored: Exception) {

                }
            }
            throw UnexpectedException()
        }
        return response
    }
}