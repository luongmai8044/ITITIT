package mowede.framework.ititit.presentation.login

import io.reactivex.Completable
import mowede.framework.ititit.exceptions.ValidationException
import mowede.framework.ititit.managers.UserManager
import mowede.framework.ititit.usecases.CompletableUseCase
import mowede.framework.ititit.usecases.SchedulerProvider
import mowede.framework.ititit.validators.LoginParamValidator
import javax.inject.Inject

class LoginUseCase @Inject constructor(schedulerProvider: SchedulerProvider,
                                       private val userManager: UserManager,
                                       private val loginParamValidator: LoginParamValidator)
    : CompletableUseCase<LoginUseCase.InputData>(schedulerProvider) {

    override fun createCompletable(data: InputData?): Completable {
        checkNotNull(data).let { param ->
            return if (loginParamValidator.isValidEmail(param.userName)
                    && loginParamValidator.isValidPassword(param.password)) {
                userManager.performLogin(param.userName, param.password)
            } else {
                Completable.error(ValidationException())
            }
        }
    }

    data class InputData(val userName: String, val password: String)

}