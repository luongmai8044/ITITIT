package mowede.framework.ititit.util

import io.reactivex.Flowable
import io.reactivex.functions.Function
import java.util.concurrent.TimeUnit

class RetryWithDelay(private val maxRetryCount: Int,
                     private val retryDelay: Long,
                     private val timeUnit: TimeUnit)
    : Function<Flowable<out Throwable>, Flowable<Any>> {
    private var retryCount: Int = 0

    init {
        this.retryCount = 0
    }

    override fun apply(attempts: Flowable<out Throwable>): Flowable<Any> {
        return attempts.flatMap { throwable ->
            if (++retryCount < maxRetryCount) {
                return@flatMap Flowable.timer(retryDelay, timeUnit)
            } else {
                return@flatMap Flowable.error<Any>(throwable)
            }
        }
    }
}