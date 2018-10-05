package mowede.framework.ititit.ui.login.interactor

import io.reactivex.Single
import mowede.framework.ititit.datasource.remote.request.LoginRequest
import mowede.framework.ititit.usecases.SingleInteractor
import mowede.framework.ititit.repository.DataRepository
import mowede.framework.ititit.repository.model.User
import mowede.framework.ititit.util.AppConstants
import mowede.framework.ititit.util.SchedulerProvider
import javax.inject.Inject


data class LoginParam(val userName: String, val password: ByteArray)

class ServerLoginInteractor
@Inject constructor(schedulerProvider: SchedulerProvider,
                    private val dataRepository: DataRepository)
    : SingleInteractor<LoginParam, User>(schedulerProvider) {
    override fun createSingle(data: LoginParam?): Single<User> {
        checkNotNull(data)
        return dataRepository.performServerLogin(
                LoginRequest.ServerLoginRequest(data!!.userName, data.password.toString())
        ).doOnSuccess { response ->
            dataRepository.updateUserInformation(response, AppConstants.LoggedInMode.LOGGED_IN_MODE_SERVER)
        }
    }

}