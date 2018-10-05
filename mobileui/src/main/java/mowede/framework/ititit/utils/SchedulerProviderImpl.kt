package mowede.framework.ititit.utils

import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import mowede.framework.ititit.usecases.SchedulerProvider
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SchedulerProviderImpl @Inject constructor() : SchedulerProvider {
    override fun io(): Scheduler {
        return Schedulers.io()
    }

    override fun ui(): Scheduler {
        return AndroidSchedulers.mainThread()
    }

    override fun computation(): Scheduler {
        return Schedulers.computation()
    }
}