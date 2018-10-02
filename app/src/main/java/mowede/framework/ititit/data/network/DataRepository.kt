package mowede.framework.ititit.data.network

import io.reactivex.Single
import io.reactivex.subjects.PublishSubject
import mowede.framework.ititit.data.network.request.LoginRequest
import mowede.framework.ititit.data.network.response.LoginResponse
import mowede.framework.ititit.data.network.response.LogoutResponse
import retrofit2.http.Body

data class Event(
        var type : String,
        var data : Any
)

interface DataRepository {

    fun logout() : Single<LogoutResponse>

    fun performServerLogin(@Body request: LoginRequest.ServerLoginRequest): Single<LoginResponse>

    fun performFBLogin(@Body request: LoginRequest.FacebookLoginRequest): Single<LoginResponse>

    fun performGoogleLogin(@Body request: LoginRequest.GoogleLoginRequest): Single<LoginResponse>
}