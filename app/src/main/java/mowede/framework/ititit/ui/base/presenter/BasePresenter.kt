package mowede.framework.ititit.ui.base.presenter

import io.reactivex.CompletableObserver
import io.reactivex.SingleObserver
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import mowede.framework.ititit.ui.base.interactor.MVPInteractor
import mowede.framework.ititit.ui.base.view.MVPView

abstract class BasePresenter<V : MVPView, I : MVPInteractor> internal constructor(protected var interactor: I, protected val compositeDisposable: CompositeDisposable) : MVPPresenter<V, I> {

    private var view: V? = null
    private val isViewAttached: Boolean get() = view != null

    override fun onAttach(view: V?) {
        this.view = view
    }

    override fun getView(): V? = view

    override fun onDetach() {
        compositeDisposable.dispose()
        view = null
    }

    /**
     * create a subscriber for a SingleObservable
     * @param onSuccess: Action on success
     * @param onError: Action on error, return false if no need handle general exceptions, otherwise return true
     * @return a SingleObserver
     */
    protected fun <T> makeSingleSubscriber(view: MVPView?, onSuccess: ((T) -> Unit), onError: ((Throwable)) -> Boolean): SingleObserver<T> {
        return object : SingleObserver<T> {
            override fun onSuccess(t: T) {
                onSuccess.invoke(t)
            }

            override fun onError(e: Throwable) {
                val needHandleError = onError.invoke(e)
                if (needHandleError) view?.showNetworkError()
            }

            override fun onSubscribe(d: Disposable) {
                compositeDisposable.add(d)
            }
        }
    }

    /**
     * create a subscriber for a Completable
     * @param onSuccess: Action on success
     * @param onError: Action on error, return false if no need handle general exceptions, otherwise return true
     * @return a SingleObserver
     */
    protected fun makeCompletableSubscriber(view: MVPView?, onComplete: (() -> Unit), onError: (((Throwable)) -> Boolean)? = null): CompletableObserver {
        return object : CompletableObserver {
            override fun onComplete() {
                onComplete.invoke()
            }

            override fun onError(e: Throwable) {
                val needHandleError = onError?.invoke(e) ?: true
                if (needHandleError) view?.showNetworkError()
            }

            override fun onSubscribe(d: Disposable) {
                compositeDisposable.add(d)
            }
        }
    }
}