package mowede.framework.ititit.ui.splash.presenter

import io.reactivex.disposables.CompositeDisposable
import mowede.framework.ititit.repository.UserManager
import mowede.framework.ititit.ui.base.presenter.BasePresenter
import mowede.framework.ititit.ui.splash.view.SplashMVPView
import javax.inject.Inject

class SplashPresenter
@Inject internal constructor(private val userManager: UserManager,
                             disposable: CompositeDisposable)
    : BasePresenter<SplashMVPView>(disposable), SplashMVPPresenter {

    override fun onAttach(view: SplashMVPView) {
        super.onAttach(view)
        decideActivityToOpen()
    }

    private fun decideActivityToOpen() = view?.let {
        if (isUserLoggedIn())
            it.openMainActivity()
        else
            it.openLoginActivity()
    }

    private fun isUserLoggedIn(): Boolean = userManager.isLoggedIn()

}