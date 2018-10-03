package mowede.framework.ititit.datasource.remote

import io.reactivex.Completable
import io.reactivex.Single
import mowede.framework.ititit.datasource.remote.request.LoginRequest
import mowede.framework.ititit.datasource.remote.response.LoginResponse
import mowede.framework.ititit.datasource.remote.response.LogoutResponse
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiServiceHelper {

    @POST(ApiEndPoint.ENDPOINT_SERVER_LOGIN)
    fun performServerLogin(@Body request: LoginRequest.ServerLoginRequest): Single<LoginResponse>

    @POST(ApiEndPoint.ENDPOINT_SERVER_LOGIN)
    fun testPrivateAPI(@Header("Authorization") authKey: String): Call<LoginResponse>

    @POST(ApiEndPoint.ENDPOINT_FACEBOOK_LOGIN)
    fun performFBLogin(@Body request: LoginRequest.FacebookLoginRequest): Single<LoginResponse>

    @POST(ApiEndPoint.ENDPOINT_GOOGLE_LOGIN)
    fun performGoogleLogin(@Body request: LoginRequest.GoogleLoginRequest): Single<LoginResponse>

    @POST(ApiEndPoint.ENDPOINT_LOGOUT)
    fun performLogoutApiCall(): Completable

    companion object Factory {
        fun create(retrofit: Retrofit): ApiServiceHelper {
            return retrofit.create(ApiServiceHelper::class.java)
        }
    }
}