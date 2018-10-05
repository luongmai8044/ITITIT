package mowede.framework.ititit.usecases

import io.reactivex.Single
import io.reactivex.SingleObserver
import io.reactivex.disposables.Disposable

abstract class SingleUseCase<Input, Output>
constructor(private val schedulerProvider: SchedulerProvider) {
    abstract fun createSingle(data: Input?) : Single<Output>

    fun execute(onSuccess: ((Output) -> Unit),
                onError: ((Throwable) -> Unit),
                data: Input? = null) : Disposable {
        return createSingle(data)
                .subscribeOn(schedulerProvider.io())
                .observeOn(schedulerProvider.ui())
                .subscribe(onSuccess, onError)
    }

    fun execute(data: Input? = null, subscriber: SingleObserver<Output>) {
        return createSingle(data)
                .subscribeOn(schedulerProvider.io())
                .observeOn(schedulerProvider.ui())
                .subscribe(subscriber)
    }
}