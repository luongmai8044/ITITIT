package mowede.framework.ititit.interactors

import io.reactivex.Completable
import io.reactivex.CompletableObserver
import io.reactivex.Single
import io.reactivex.SingleObserver
import io.reactivex.disposables.Disposable
import mowede.framework.ititit.util.SchedulerProvider

abstract class CompletableInteractor<Input> constructor(private val schedulerProvider: SchedulerProvider) {
    fun execute(onComplete: (() -> Unit), onError: ((Throwable) -> Unit), data: Input? = null): Disposable {
        return createCompletable(data)
                .compose(schedulerProvider.ioToMainCompletableScheduler())
                .subscribe(onComplete, onError)
    }

    fun execute(subscribe: CompletableObserver, data: Input? = null): Disposable {
        return createCompletable(data)
                .compose(schedulerProvider.ioToMainCompletableScheduler())
                .subscribe({ subscribe.onComplete() }, { subscribe.onError(it) })
    }

    protected abstract fun createCompletable(data: Input? = null): Completable
}

abstract class SingleInteractor<Input, Output> constructor(private val schedulerProvider: SchedulerProvider) {
    fun execute(onSuccess: ((Output) -> Unit), onError: ((Throwable) -> Unit), data: Input? = null): Disposable {
        return createSingle(data)
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe(onSuccess, onError)
    }

    fun execute(subscribe: SingleObserver<Output>, data: Input? = null): Disposable {
        return createSingle(data)
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ subscribe.onSuccess(it) }, { subscribe.onError(it) })
    }

    protected abstract fun createSingle(data: Input?): Single<Output>
}