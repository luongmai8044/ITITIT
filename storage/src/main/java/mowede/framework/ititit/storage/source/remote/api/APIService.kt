package mowede.framework.ititit.storage.source.remote.api

import io.reactivex.Completable
import io.reactivex.Single
import mowede.framework.ititit.storage.entity.response.LoginResponse
import mowede.framework.ititit.storage.entity.request.LoginRequest
import retrofit2.Retrofit
import retrofit2.http.Body
import retrofit2.http.POST

interface APIService {
    @POST(APIEndPoint.END_POINT_LOGIN)
    fun login(@Body data: LoginRequest): Single<LoginResponse>

    @POST(APIEndPoint.ENDPOINT_REGISTER_CONSUMER)
    fun registerConsumer(username: String, password: String): Completable

    companion object Factory {
        fun create(retrofit: Retrofit): APIService {
            return retrofit.create(APIService::class.java)
        }
    }

}