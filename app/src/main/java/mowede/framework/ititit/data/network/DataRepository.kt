package mowede.framework.ititit.data.network

import io.reactivex.Observable
import io.reactivex.Single
import mowede.framework.ititit.data.network.request.LoginRequest
import mowede.framework.ititit.data.network.response.LoginResponse
import mowede.framework.ititit.data.network.response.LogoutResponse
import retrofit2.http.Body
import javax.inject.Inject

interface DataRepository {
    fun logout() : Single<LogoutResponse>

    fun performServerLogin(@Body request: LoginRequest.ServerLoginRequest): Single<LoginResponse>

    fun performFBLogin(@Body request: LoginRequest.FacebookLoginRequest): Single<LoginResponse>

    fun performGoogleLogin(@Body request: LoginRequest.GoogleLoginRequest): Single<LoginResponse>
}

class NetworkDataRepository @Inject constructor(private val apiServiceHelper: ApiServiceHelper) : DataRepository {
    override fun performServerLogin(request: LoginRequest.ServerLoginRequest): Single<LoginResponse> {
        return apiServiceHelper.performServerLogin(request)
    }

    override fun performFBLogin(request: LoginRequest.FacebookLoginRequest): Single<LoginResponse> {
        return apiServiceHelper.performFBLogin(request)
    }

    override fun performGoogleLogin(request: LoginRequest.GoogleLoginRequest): Single<LoginResponse> {
        return apiServiceHelper.performGoogleLogin(request)
    }

    override fun logout(): Single<LogoutResponse> {
        return apiServiceHelper.performLogoutApiCall()
    }

}