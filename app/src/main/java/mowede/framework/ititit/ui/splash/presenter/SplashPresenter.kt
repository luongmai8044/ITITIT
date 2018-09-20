package mowede.framework.ititit.ui.splash.presenter

import io.reactivex.disposables.CompositeDisposable
import mowede.framework.ititit.ui.base.presenter.BasePresenter
import mowede.framework.ititit.ui.splash.interactor.SplashMVPInteractor
import mowede.framework.ititit.ui.splash.view.SplashMVPView
import javax.inject.Inject

class SplashPresenter<V : SplashMVPView, I : SplashMVPInteractor>
@Inject internal constructor(interactor: I,
                             disposable: CompositeDisposable)
    : BasePresenter<V, I>(interactor = interactor,compositeDisposable = disposable), SplashMVPPresenter<V, I> {

    override fun onAttach(view: V?) {
        super.onAttach(view)
        feedInDatabase()
    }

    private fun feedInDatabase() = interactor?.let {
        compositeDisposable.add(it.seedQuestions()
                .flatMap { interactor?.seedOptions() }
                .subscribe {
                    getView()?.let { decideActivityToOpen() }
                })
    }

    private fun decideActivityToOpen() = getView()?.let {
        if (isUserLoggedIn())
            it.openMainActivity()
        else
            it.openLoginActivity()
    }

    private fun isUserLoggedIn(): Boolean {
        interactor?.let { return it.isUserLoggedIn() }
        return false
    }

}