package mowede.framework.ititit.util.extension

import io.reactivex.Flowable
import io.reactivex.Single
import io.reactivex.functions.BiFunction
import mowede.framework.ititit.datasource.remote.DomainMappable
import mowede.framework.ititit.repository.model.HttpCallFailureException
import mowede.framework.ititit.repository.model.MaxRetriesExceededException
import mowede.framework.ititit.repository.model.NoNetworkException
import mowede.framework.ititit.repository.model.ServerUnreachableException
import mowede.framework.ititit.util.CommonUtil
import retrofit2.HttpException
import timber.log.Timber
import java.net.SocketTimeoutException
import java.net.UnknownHostException

fun <T : DomainMappable<R>, R> Single<T>.mapToDomain(): Single<R> = this.map { it.asDomain() }

fun <T> Single<T>.mapNetworkErrors(): Single<T> =
        this.onErrorResumeNext { error ->
            when (error) {
                is SocketTimeoutException -> Single.error(NoNetworkException(error))
                is UnknownHostException -> Single.error(ServerUnreachableException(error))
                is HttpException -> Single.error(HttpCallFailureException(error))
                else -> Single.error(error)
            }
        }

inline fun <reified T : R, R> Single<R>.mapError(): Single<R> =
        this.onErrorResumeNext { error ->
            if (error is HttpException && error.code() >= 400) {
                CommonUtil.mapJsonObjectToDomain(error, T::class.java)?.let {
                    Single.just(it)
                } ?: Single.error(kotlin.IllegalStateException("Mapping http body failed"))
            } else {
                Single.error(error)
            }
        }

fun <T, R> Single<T>.retry(count: Int, action: (Throwable) -> Flowable<R>): Single<T> {
    return this.retryWhen { errors ->
        Flowable.zip(errors, Flowable.range(1, Int.MAX_VALUE), BiFunction<Throwable, Int, Pair<Throwable, Int>> { item, count -> Pair(item, count) })
                .flatMap { item ->
                    if (item.second < count) {
                        Timber.d("RETRY REQUEST")
                        action.invoke(item.first)
                    } else {
                        Flowable.error<T>(MaxRetriesExceededException(item.first))
                    }
                }
    }
}