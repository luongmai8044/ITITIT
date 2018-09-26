package mowede.framework.ititit.ui.login.presenter

import io.reactivex.disposables.CompositeDisposable
import mowede.framework.ititit.ui.base.presenter.BasePresenter
import mowede.framework.ititit.ui.login.interactor.LoginInteractor
import mowede.framework.ititit.ui.login.interactor.LoginMVPInteractor
import mowede.framework.ititit.ui.login.view.LoginMVPView
import mowede.framework.ititit.util.AppConstants
import javax.inject.Inject

class LoginPresenter
@Inject internal constructor(interactor: LoginInteractor,
                             disposable: CompositeDisposable)
    : BasePresenter<LoginMVPView, LoginMVPInteractor>(interactor, disposable), LoginMVPPresenter {

    override fun onServerLoginClicked(email: String, password: String) {
        when {
            email.isEmpty() -> view?.showValidationMessage(AppConstants.EMPTY_EMAIL_ERROR)
            password.isEmpty() -> view?.showValidationMessage(AppConstants.EMPTY_PASSWORD_ERROR)
            else -> {
                view?.showProgress()
                interactor.doServerLoginApiCall(email, password)
                        .subscribe(makeSingleSubscriber(view,
                                { user ->
                                    view?.hideProgress()
                                    view?.openMainActivity()
                                },
                                { throwable ->
                                    view?.hideProgress()
                                    when (throwable) {
                                        is NoSuchElementException -> {
                                            println(throwable)
                                            view?.showAnError()
                                            false
                                        }
                                        else -> {
                                            true
                                        }
                                    }
                                }))
            }
        }
    }

    override fun onFBLoginClicked() {
        view?.showProgress()
        interactor.doFBLoginApiCall()
                .subscribe(makeCompletableSubscriber(
                        view = view,
                        onComplete = { view?.openMainActivity() }
                ))
    }

    override fun onGoogleLoginClicked() {
        view?.showProgress()
        interactor.let {
            it.doGoogleLoginApiCall()
                    .subscribe(makeCompletableSubscriber(
                            view = view,
                            onComplete = { view?.openMainActivity() }
                    ))
        }

    }
}