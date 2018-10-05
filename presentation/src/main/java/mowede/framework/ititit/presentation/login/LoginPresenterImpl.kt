package mowede.framework.ititit.presentation.login

import io.reactivex.disposables.CompositeDisposable
import mowede.framework.ititit.exceptions.ValidationException
import mowede.framework.ititit.presentation.NetworkPresenter
import mowede.framework.ititit.usecases.login.LoginUseCase
import javax.inject.Inject

class LoginPresenterImpl @Inject constructor(private val loginUseCase: LoginUseCase,
                                             compositeDisposable: CompositeDisposable)
    : LoginPresenter, NetworkPresenter<LoginView>(compositeDisposable) {

    override var view: LoginView? = null

    override fun onUserLogIn(username: String, password: String) {
        view?.showProgress()
        val data = LoginUseCase.InputData(username, password)
        loginUseCase.execute(data, makeNetworkCompletableSubscriber(
                onComplete = {
                    view?.hideProgress()
                    view?.navigateToHome()
                },
                onError = { error ->
                    view?.hideProgress()
                    // return true to notify NetworkPresenter handle error
                    // return false NetworkPresenter will ignore errors handling
                    return@makeNetworkCompletableSubscriber handleLoginError(error)
                }
        ))
    }

    private fun handleLoginError(error: Throwable): Boolean {
        when (error) {
            is ValidationException -> view?.showValidationError()
            else -> return true
        }
        return false
    }
}