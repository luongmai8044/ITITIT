package mowede.framework.ititit.ui.login.interactor

import io.reactivex.Completable
import io.reactivex.Flowable
import io.reactivex.Single
import mowede.framework.ititit.repository.model.User
import mowede.framework.ititit.util.extension.mapError
import mowede.framework.ititit.util.extension.mapNetworkErrors
import mowede.framework.ititit.util.extension.mapToDomain
import mowede.framework.ititit.repository.AppDataRepository
import mowede.framework.ititit.datasource.remote.request.LoginRequest
import mowede.framework.ititit.datasource.remote.response.LoginResponse
import mowede.framework.ititit.datasource.preferences.PreferenceHelper
import mowede.framework.ititit.ui.base.interactor.BaseInteractor
import mowede.framework.ititit.util.AppConstants
import mowede.framework.ititit.util.SchedulerProvider
import mowede.framework.ititit.util.extension.retry
import retrofit2.HttpException
import java.net.HttpURLConnection
import javax.inject.Inject

class LoginInteractor
@Inject internal constructor(preferenceHelper: PreferenceHelper,
                             dataRepository: AppDataRepository,
                             private val schedulerProvider: SchedulerProvider)
    : BaseInteractor(preferenceHelper, dataRepository), LoginMVPInteractor {

    override fun doGoogleLoginApiCall(): Completable =
            dataRepository.performGoogleLogin(LoginRequest.GoogleLoginRequest("test1", "test1"))
                    .doOnSuccess { response ->
                        dataRepository.updateUserInformation(response, AppConstants.LoggedInMode.LOGGED_IN_MODE_GOOGLE)
                    }
                    .toCompletable()
                    .compose(schedulerProvider.ioToMainCompletableScheduler())

    override fun doFBLoginApiCall() : Completable =
            dataRepository.performFBLogin(LoginRequest.FacebookLoginRequest("test3", "test4"))
                    .doOnSuccess { response ->
                        dataRepository.updateUserInformation(response, AppConstants.LoggedInMode.LOGGED_IN_MODE_FB)
                    }
                    .toCompletable()
                    .compose(schedulerProvider.ioToMainCompletableScheduler())


    override fun doServerLoginApiCall(email: String, password: String) : Single<User> =
            dataRepository.performServerLogin(LoginRequest.ServerLoginRequest(email = email, password = password))
                    .doOnSuccess { response ->
                        dataRepository.updateUserInformation(response, AppConstants.LoggedInMode.LOGGED_IN_MODE_SERVER)
                    }
                    .compose(schedulerProvider.ioToMainSingleScheduler())

    override fun doLogout(): Completable {
        return dataRepository.logout()
                .doOnComplete {  }
                .compose(schedulerProvider.ioToMainCompletableScheduler())
    }
}