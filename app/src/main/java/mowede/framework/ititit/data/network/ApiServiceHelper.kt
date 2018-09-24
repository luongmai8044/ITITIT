package mowede.framework.ititit.data.network

import io.reactivex.Single
import mowede.framework.ititit.data.network.request.LoginRequest
import mowede.framework.ititit.data.network.response.LoginResponse
import mowede.framework.ititit.data.network.response.LogoutResponse
import retrofit2.Retrofit
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiServiceHelper {

    @POST(ApiEndPoint.ENDPOINT_SERVER_LOGIN)
    fun performServerLogin(@Body request: LoginRequest.ServerLoginRequest): Single<LoginResponse>

    @POST(ApiEndPoint.ENDPOINT_SERVER_LOGIN)
    fun testPrivateAPI(@Header("Authorization") authKey: String): Single<LoginResponse>

    @POST(ApiEndPoint.ENDPOINT_FACEBOOK_LOGIN)
    fun performFBLogin(@Body request: LoginRequest.FacebookLoginRequest): Single<LoginResponse>

    @POST(ApiEndPoint.ENDPOINT_GOOGLE_LOGIN)
    fun performGoogleLogin(@Body request: LoginRequest.GoogleLoginRequest): Single<LoginResponse>

    @POST(ApiEndPoint.ENDPOINT_LOGOUT)
    fun performLogoutApiCall(): Single<LogoutResponse>

    companion object Factory {
        fun create(retrofit: Retrofit): ApiServiceHelper {
            return retrofit.create(ApiServiceHelper::class.java)
        }
    }
}