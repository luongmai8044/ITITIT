package mowede.framework.ititit.presentation.splash

import io.reactivex.Completable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import mowede.framework.ititit.managers.UserManager
import mowede.framework.ititit.presentation.BasePresenter
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class SplashPresenterImpl @Inject constructor(private val userManager: UserManager,
                                              compositeDisposable: CompositeDisposable)
    : SplashPresenter, BasePresenter<SplashView>(compositeDisposable) {

    private var disposable: Disposable? = null

    override fun start() {
        disposable = Completable.fromAction {}
                .delay(3, TimeUnit.SECONDS)
                .subscribe {
                    if (userManager.isLoggedIn()) {
                        view?.navigateToHome()
                    } else {
                        view?.navigateToLogin()
                    }
                }
    }

    override fun stop() {
        disposable?.dispose()
    }
}