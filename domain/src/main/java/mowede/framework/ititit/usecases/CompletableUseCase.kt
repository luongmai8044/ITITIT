package mowede.framework.ititit.usecases

import io.reactivex.Completable
import io.reactivex.CompletableObserver
import io.reactivex.disposables.Disposable

abstract class CompletableUseCase<Input>
constructor(private val schedulerProvider: SchedulerProvider) {
    fun execute(onComplete: (() -> Unit), onError: ((Throwable) -> Unit), data: Input? = null): Disposable {
        return createCompletable(data)
                .subscribeOn(schedulerProvider.io())
                .observeOn(schedulerProvider.ui())
                .subscribe(onComplete, onError)

    }

    fun execute(data: Input? = null, subscriber: CompletableObserver) {
        return createCompletable(data)
                .subscribeOn(schedulerProvider.io())
                .observeOn(schedulerProvider.ui())
                .subscribe(subscriber)
    }

    abstract fun createCompletable(data: Input?): Completable
}