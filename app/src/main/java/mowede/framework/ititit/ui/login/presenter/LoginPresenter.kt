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
            email.isEmpty() -> getView()?.showValidationMessage(AppConstants.EMPTY_EMAIL_ERROR)
            password.isEmpty() -> getView()?.showValidationMessage(AppConstants.EMPTY_PASSWORD_ERROR)
            else -> {
                getView()?.showProgress()
                interactor.doServerLoginApiCall(email, password)
                        .subscribe(makeSingleSubscriber(getView(),
                                { user ->
                                    getView()?.hideProgress()
                                    getView()?.openMainActivity()
                                },
                                { throwable ->
                                    getView()?.hideProgress()
                                    when (throwable) {
                                        is NoSuchElementException -> {
                                            println(throwable)
                                            getView()?.showAnError()
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
        getView()?.showProgress()
        interactor.doFBLoginApiCall()
                .subscribe(makeCompletableSubscriber(
                        view = getView(),
                        onComplete = { getView()?.openMainActivity() }
                ))
    }

    override fun onGoogleLoginClicked() {
        getView()?.showProgress()
        interactor.let {
            it.doGoogleLoginApiCall()
                    .subscribe(makeCompletableSubscriber(
                            view = getView(),
                            onComplete = { getView()?.openMainActivity() }
                    ))
        }

    }
}