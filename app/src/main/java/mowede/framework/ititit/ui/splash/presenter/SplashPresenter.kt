package mowede.framework.ititit.ui.splash.presenter

import io.reactivex.disposables.CompositeDisposable
import mowede.framework.ititit.ui.base.presenter.BasePresenter
import mowede.framework.ititit.ui.splash.interactor.SplashMVPInteractor
import mowede.framework.ititit.ui.splash.view.SplashMVPView
import mowede.framework.ititit.util.SchedulerProvider
import javax.inject.Inject

class SplashPresenter
@Inject internal constructor(interactor: SplashMVPInteractor,
                             disposable: CompositeDisposable,
                             private val schedulerProvider: SchedulerProvider)
    : BasePresenter<SplashMVPView, SplashMVPInteractor>(interactor, disposable), SplashMVPPresenter {

    override fun onAttach(view: SplashMVPView) {
        super.onAttach(view)
        feedInDatabase()
    }

    private fun feedInDatabase() = interactor.let {
        compositeDisposable.add(it.seedQuestions()
                .flatMap { interactor.seedOptions() }
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe {
                    view?.let { decideActivityToOpen() }
                })
    }

    private fun decideActivityToOpen() = view?.let {
        if (isUserLoggedIn())
            it.openMainActivity()
        else
            it.openLoginActivity()
    }

    private fun isUserLoggedIn(): Boolean =
        interactor.isUserLoggedIn()

}