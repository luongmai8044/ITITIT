package mowede.framework.ititit.ui.login.presenter

import io.reactivex.disposables.CompositeDisposable
import mowede.framework.ititit.data.model.UserEventType
import mowede.framework.ititit.data.network.EventDataRepository
import mowede.framework.ititit.ui.base.presenter.BaseEventPresenter
import mowede.framework.ititit.ui.login.interactor.LoginInteractor
import mowede.framework.ititit.ui.login.interactor.LoginMVPInteractor
import mowede.framework.ititit.ui.login.view.LoginMVPView
import mowede.framework.ititit.util.AppConstants
import timber.log.Timber
import javax.inject.Inject

class LoginPresenter
@Inject internal constructor(interactor: LoginInteractor,
                             disposable: CompositeDisposable,
                             private val eventDataRepository: EventDataRepository)
    : BaseEventPresenter<LoginMVPView, LoginMVPInteractor>(interactor, disposable, eventDataRepository), LoginMVPPresenter {

    override fun onAttach(view: LoginMVPView) {
        eventDataRepository.onEventChanel.subscribe {
            it.apply {
                if (this.type == UserEventType.NEW_USER_LOGIN.value){
                    view.notifyNewUserLogin()
                }
            }
        }
    }

    override fun onServerLoginClicked(email: String, password: String) {
        Timber.i("Sample Log")
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