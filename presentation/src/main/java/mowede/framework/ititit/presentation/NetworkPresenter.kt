package mowede.framework.ititit.presentation

import io.reactivex.CompletableObserver
import io.reactivex.SingleObserver
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import mowede.framework.ititit.exceptions.NetworkException

abstract class NetworkPresenter<V : NetworkView> constructor(compositeDisposable: CompositeDisposable)
    : Presenter<V>, BasePresenter<V>(compositeDisposable) {

    protected fun handleNetworkError(error: Throwable) {
        when (error) {
            is NetworkException -> view?.showNoInternetConnectionError()
            else -> view?.showUnexpectedError()
        }
    }

    protected fun <T> makeNetworkSingleSubscriber(onSuccess: ((T) -> Unit),
                                                  onError: ((Throwable) -> Boolean)): SingleObserver<T> {
        return object : SingleObserver<T> {
            override fun onSuccess(item: T) {
                onSuccess.invoke(item)
            }

            override fun onSubscribe(disposable: Disposable) {
                compositeDisposable.add(disposable)
            }

            override fun onError(e: Throwable) {
                val handleErrorRequired = onError.invoke(e)
                if (handleErrorRequired) handleNetworkError(e)
            }

        }
    }

    protected fun makeNetworkCompletableSubscriber(onComplete: (() -> Unit),
                                                   onError: ((Throwable) -> Boolean)): CompletableObserver {
        return object : CompletableObserver {

            override fun onComplete() {
                onComplete.invoke()
            }

            override fun onSubscribe(disposable: Disposable) {
                compositeDisposable.add(disposable)
            }

            override fun onError(e: Throwable) {
                val handleErrorRequired = onError.invoke(e)
                if (handleErrorRequired) handleNetworkError(e)
            }

        }
    }
}