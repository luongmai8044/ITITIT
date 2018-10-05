package mowede.framework.ititit.presentation

import io.reactivex.disposables.CompositeDisposable

abstract class BasePresenter<V: View> constructor(protected val compositeDisposable: CompositeDisposable)
    : Presenter<V> {

    override var view: V? = null

    override fun start() {

    }

    override fun stop() {
        compositeDisposable.dispose()
    }
}