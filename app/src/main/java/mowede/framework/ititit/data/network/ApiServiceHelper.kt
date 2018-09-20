package mowede.framework.ititit.data.network

import io.reactivex.Observable
import mowede.framework.ititit.BuildConfig
import mowede.framework.ititit.data.network.request.LoginRequest
import mowede.framework.ititit.data.network.response.LoginResponse
import mowede.framework.ititit.data.network.response.LogoutResponse
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiServiceHelper {

    @POST(ApiEndPoint.ENDPOINT_SERVER_LOGIN)
    fun performServerLogin(@Body request: LoginRequest.ServerLoginRequest): Observable<LoginResponse>

    @POST(ApiEndPoint.ENDPOINT_FACEBOOK_LOGIN)
    fun performFBLogin(@Body request: LoginRequest.FacebookLoginRequest): Observable<LoginResponse>

    @POST(ApiEndPoint.ENDPOINT_GOOGLE_LOGIN)
    fun performGoogleLogin(@Body request: LoginRequest.GoogleLoginRequest): Observable<LoginResponse>

    @POST(ApiEndPoint.ENDPOINT_LOGOUT)
    fun performLogoutApiCall(): Observable<LogoutResponse>

    companion object Factory {
        fun create(): ApiServiceHelper {
            val retrofit = retrofit2.Retrofit.Builder()
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(BuildConfig.BASE_URL)
                    .build()

            return retrofit.create(ApiServiceHelper::class.java)
        }
    }
}