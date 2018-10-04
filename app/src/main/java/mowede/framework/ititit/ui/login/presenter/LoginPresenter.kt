package mowede.framework.ititit.ui.login.presenter

import io.reactivex.SingleObserver
import io.reactivex.disposables.CompositeDisposable
import mowede.framework.ititit.repository.model.User
import mowede.framework.ititit.ui.base.presenter.BasePresenter
import mowede.framework.ititit.ui.login.interactor.LoginParam
import mowede.framework.ititit.ui.login.interactor.ServerLoginInteractor
import mowede.framework.ititit.ui.login.interactor.SocialLoginInteractor
import mowede.framework.ititit.ui.login.view.LoginMVPView
import mowede.framework.ititit.util.AppConstants
import timber.log.Timber
import java.nio.charset.Charset
import javax.inject.Inject

class LoginPresenter
@Inject internal constructor(disposable: CompositeDisposable,
                             private val serverLoginInteractor: ServerLoginInteractor,
                             private val socialLoginInteractor: SocialLoginInteractor)
    : BasePresenter<LoginMVPView>(disposable), LoginMVPPresenter {

    override fun onServerLoginClicked(email: String, password: String) {
        Timber.i("Sample Log")
        when {
            email.isEmpty() -> view?.showValidationMessage(AppConstants.EMPTY_EMAIL_ERROR)
            password.isEmpty() -> view?.showValidationMessage(AppConstants.EMPTY_PASSWORD_ERROR)
            else -> {
                view?.showProgress()
                val data = LoginParam(email, password.toByteArray())
                serverLoginInteractor.execute(serverLoginSubscriber, data)
            }
        }
    }

    override fun onFBLoginClicked() {
        view?.showProgress()
        socialLoginInteractor.execute(
                makeCompletableSubscriber(
                        view,
                        onComplete = {
                            view?.hideProgress()
                            view?.openMainActivity()
                        }
                ),
                SocialLoginInteractor.Param("123", "456", SocialLoginInteractor.SocialType.FACEBOOK))
    }

    override fun onGoogleLoginClicked() {
        view?.showProgress()
        socialLoginInteractor.execute(
                makeCompletableSubscriber(
                        view,
                        onComplete = {
                            view?.hideProgress()
                            view?.openMainActivity()
                        }
                ),
                SocialLoginInteractor.Param("123", "456", SocialLoginInteractor.SocialType.GOOGLE))
    }

    private val serverLoginSubscriber: SingleObserver<User> by lazy {
        makeSingleSubscriber<User>(view,
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
                            return@makeSingleSubscriber false
                        }
                        else -> {
                            return@makeSingleSubscriber true
                        }
                    }
                })
    }
}