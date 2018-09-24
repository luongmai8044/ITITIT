package mowede.framework.ititit.ui.login.interactor

import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single
import mowede.framework.ititit.data.domain.Users
import mowede.framework.ititit.data.mapError
import mowede.framework.ititit.data.mapNetworkErrors
import mowede.framework.ititit.data.mapToDomain
import mowede.framework.ititit.data.network.DataRepository
import mowede.framework.ititit.data.network.request.LoginRequest
import mowede.framework.ititit.data.network.response.LoginResponse
import mowede.framework.ititit.data.preferences.PreferenceHelper
import mowede.framework.ititit.ui.base.interactor.BaseInteractor
import mowede.framework.ititit.util.AppConstants
import mowede.framework.ititit.util.SchedulerProvider
import javax.inject.Inject

class LoginInteractor
@Inject internal constructor(preferenceHelper: PreferenceHelper,
                             dataRepository: DataRepository,
                             private val schedulerProvider: SchedulerProvider)
    : BaseInteractor(preferenceHelper, dataRepository), LoginMVPInteractor {

    override fun doGoogleLoginApiCall() : Single<Users> =
            dataRepository.performGoogleLogin(LoginRequest.GoogleLoginRequest("test1", "test1"))
                    .mapNetworkErrors()
                    .mapError()
                    .doOnSuccess { response ->
                        updateUserInSharedPref(response, AppConstants.LoggedInMode.LOGGED_IN_MODE_GOOGLE)
                    }
                    .mapToDomain()
                    .compose(schedulerProvider.ioToMainSingleScheduler())

    override fun doFBLoginApiCall() : Completable =
            dataRepository.performFBLogin(LoginRequest.FacebookLoginRequest("test3", "test4"))
                    .mapNetworkErrors()
                    .mapError()
                    .doOnSuccess { response ->
                        updateUserInSharedPref(response, AppConstants.LoggedInMode.LOGGED_IN_MODE_FB)
                    }
                    .toCompletable()
                    .compose(schedulerProvider.ioToMainCompletableScheduler())


    override fun doServerLoginApiCall(email: String, password: String) : Single<Users> =
            dataRepository.performServerLogin(LoginRequest.ServerLoginRequest(email = email, password = password))
                    .mapNetworkErrors()
                    .mapError()
                    .doOnSuccess { response ->
                        updateUserInSharedPref(response, AppConstants.LoggedInMode.LOGGED_IN_MODE_SERVER)
                    }
                    .mapToDomain()
                    .compose(schedulerProvider.ioToMainSingleScheduler())


    private fun updateUserInSharedPref(loginResponse: LoginResponse, loggedInMode: AppConstants.LoggedInMode) =
            preferenceHelper.let {
                it.setCurrentUserId(loginResponse.userId)
                it.setAccessToken(loginResponse.accessToken)
                it.setCurrentUserLoggedInMode(loggedInMode)
            }
}