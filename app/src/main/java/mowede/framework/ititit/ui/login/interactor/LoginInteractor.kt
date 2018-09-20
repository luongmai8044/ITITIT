package mowede.framework.ititit.ui.login.interactor

import io.reactivex.Completable
import io.reactivex.Observable
import mowede.framework.ititit.data.model.User
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

    override fun doGoogleLoginApiCall() : Observable<User> =
            dataRepository.performGoogleLogin(LoginRequest.GoogleLoginRequest("test1", "test1"))
                    .doOnNext { response ->
                        updateUserInSharedPref(response, AppConstants.LoggedInMode.LOGGED_IN_MODE_GOOGLE)
                    }
                    .map { response -> User(response.userName, response.userEmail) }
                    .compose(schedulerProvider.ioToMainObservableScheduler())

    override fun doFBLoginApiCall() : Completable =
            dataRepository.performFBLogin(LoginRequest.FacebookLoginRequest("test3", "test4"))
                    .doOnNext { response ->
                        updateUserInSharedPref(response, AppConstants.LoggedInMode.LOGGED_IN_MODE_FB)
                    }
                    .ignoreElements()
                    .compose(schedulerProvider.ioToMainCompletableScheduler())


    override fun doServerLoginApiCall(email: String, password: String) : Observable<User> =
            dataRepository.performServerLogin(LoginRequest.ServerLoginRequest(email = email, password = password))
                    .doOnNext { response ->
                        updateUserInSharedPref(response, AppConstants.LoggedInMode.LOGGED_IN_MODE_SERVER)
                    }
                    .map { response -> User(response.userName, response.userEmail) }
                    .compose(schedulerProvider.ioToMainObservableScheduler())


    private fun updateUserInSharedPref(loginResponse: LoginResponse, loggedInMode: AppConstants.LoggedInMode) =
            preferenceHelper.let {
                it.setCurrentUserId(loginResponse.userId)
                it.setAccessToken(loginResponse.accessToken)
                it.setCurrentUserLoggedInMode(loggedInMode)
            }
}