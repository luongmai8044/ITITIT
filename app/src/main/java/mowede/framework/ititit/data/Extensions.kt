package mowede.framework.ititit.data

import io.reactivex.Single
import mowede.framework.ititit.data.domain.HttpCallFailureException
import mowede.framework.ititit.data.domain.NoNetworkException
import mowede.framework.ititit.data.domain.ServerUnreachableException
import mowede.framework.ititit.data.network.DomainMappable
import mowede.framework.ititit.util.CommonUtil
import retrofit2.HttpException
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