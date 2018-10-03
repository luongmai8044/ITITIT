package mowede.framework.ititit.ui.login.interactor

import io.reactivex.Completable
import io.reactivex.Flowable
import io.reactivex.Single
import mowede.framework.ititit.data.model.User
import mowede.framework.ititit.util.extension.mapError
import mowede.framework.ititit.util.extension.mapNetworkErrors
import mowede.framework.ititit.util.extension.mapToDomain
import mowede.framework.ititit.data.network.DataRepository
import mowede.framework.ititit.data.network.request.LoginRequest
import mowede.framework.ititit.data.network.response.LoginResponse
import mowede.framework.ititit.data.preferences.PreferenceHelper
import mowede.framework.ititit.ui.base.interactor.BaseInteractor
import mowede.framework.ititit.util.AppConstants
import mowede.framework.ititit.util.SchedulerProvider
import mowede.framework.ititit.util.extension.retry
import retrofit2.HttpException
import java.net.HttpURLConnection
import javax.inject.Inject

class LoginInteractor
@Inject internal constructor(preferenceHelper: PreferenceHelper,
                             dataRepository: DataRepository,
                             private val schedulerProvider: SchedulerProvider)
    : BaseInteractor(preferenceHelper, dataRepository), LoginMVPInteractor {

    override fun doGoogleLoginApiCall(): Completable =
            dataRepository.performGoogleLogin(LoginRequest.GoogleLoginRequest("test1", "test1"))
                    .retry(AppConstants.MAX_RETRY_VALUE
                    ) { error ->
                        if (error is HttpException && error.code() == HttpURLConnection.HTTP_UNAUTHORIZED)
                            Flowable.just("retry").delay(1000, java.util.concurrent.TimeUnit.MILLISECONDS)
                        else
                            Flowable.error(error)
                    }
                    .mapNetworkErrors()
                    .mapError()
                    .doOnSuccess { response ->
                        updateUserInSharedPref(response, AppConstants.LoggedInMode.LOGGED_IN_MODE_GOOGLE)
                    }
                    .toCompletable()
                    .compose(schedulerProvider.ioToMainCompletableScheduler())

    override fun doFBLoginApiCall() : Completable =
            dataRepository.performFBLogin(LoginRequest.FacebookLoginRequest("test3", "test4"))
                    .mapNetworkErrors()
                    .mapError()
                    .doOnSuccess { response ->
                        updateUserInSharedPref(response, AppConstants.LoggedInMode.LOGGED_IN_MODE_FB)
                    }
                    .toCompletable()
                    .compose(schedulerProvider.ioToMainCompletableScheduler())


    override fun doServerLoginApiCall(email: String, password: String) : Single<User> =
            dataRepository.performServerLogin(LoginRequest.ServerLoginRequest(email = email, password = password))
                    .retry(AppConstants.MAX_RETRY_VALUE
                    ) { error ->
                        if (error is HttpException && error.code() == HttpURLConnection.HTTP_UNAUTHORIZED)
                            Flowable.just("retry").delay(1000, java.util.concurrent.TimeUnit.MILLISECONDS)
                        else
                            Flowable.error(error)
                    }
                    .mapNetworkErrors()
                    .mapError()
                    .doOnSuccess { response ->
                        updateUserInSharedPref(response, AppConstants.LoggedInMode.LOGGED_IN_MODE_SERVER)
                    }
                    .mapToDomain()
                    .compose(schedulerProvider.ioToMainSingleScheduler())

    override fun doLogout(): Completable {
        return dataRepository.logout()
                .mapNetworkErrors()
                .mapError()
                .doOnSuccess {

                }
                .toCompletable()
                .compose(schedulerProvider.ioToMainCompletableScheduler())
    }

    private fun updateUserInSharedPref(loginResponse: LoginResponse, loggedInMode: AppConstants.LoggedInMode) =
            preferenceHelper.let {
                it.setCurrentUserId(loginResponse.userId)
                it.setAccessToken(loginResponse.accessToken)
                it.setCurrentUserLoggedInMode(loggedInMode)
            }
}