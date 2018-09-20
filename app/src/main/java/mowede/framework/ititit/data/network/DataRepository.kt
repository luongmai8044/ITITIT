package mowede.framework.ititit.data.network

import io.reactivex.Observable
import mowede.framework.ititit.data.network.request.LoginRequest
import mowede.framework.ititit.data.network.response.LoginResponse
import mowede.framework.ititit.data.network.response.LogoutResponse
import retrofit2.http.Body
import javax.inject.Inject

interface DataRepository {
    fun logout() : Observable<LogoutResponse>

    fun performServerLogin(@Body request: LoginRequest.ServerLoginRequest): Observable<LoginResponse>

    fun performFBLogin(@Body request: LoginRequest.FacebookLoginRequest): Observable<LoginResponse>

    fun performGoogleLogin(@Body request: LoginRequest.GoogleLoginRequest): Observable<LoginResponse>
}

class NetworkDataRepository @Inject constructor(private val apiServiceHelper: ApiServiceHelper) : DataRepository {
    override fun performServerLogin(request: LoginRequest.ServerLoginRequest): Observable<LoginResponse> {
        return apiServiceHelper.performServerLogin(request)
    }

    override fun performFBLogin(request: LoginRequest.FacebookLoginRequest): Observable<LoginResponse> {
        return apiServiceHelper.performFBLogin(request)
    }

    override fun performGoogleLogin(request: LoginRequest.GoogleLoginRequest): Observable<LoginResponse> {
        return apiServiceHelper.performGoogleLogin(request)
    }

    override fun logout(): Observable<LogoutResponse> {
        return apiServiceHelper.performLogoutApiCall()
    }

}