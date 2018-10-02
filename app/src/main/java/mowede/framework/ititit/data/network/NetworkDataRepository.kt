package mowede.framework.ititit.data.network

import io.reactivex.Single
import mowede.framework.ititit.data.network.realtime.EventService
import mowede.framework.ititit.data.network.request.LoginRequest
import mowede.framework.ititit.data.network.response.LoginResponse
import mowede.framework.ititit.data.network.response.LogoutResponse
import javax.inject.Inject


class NetworkDataRepository @Inject constructor(private val apiServiceHelper: ApiServiceHelper,
                                                private val eventService: EventService) : DataRepository {

    override fun performServerLogin(request: LoginRequest.ServerLoginRequest): Single<LoginResponse> {
        return apiServiceHelper.performServerLogin(request).doAfterSuccess {
            eventService.login(it.userEmail!!)
        }
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