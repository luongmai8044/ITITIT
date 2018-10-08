package mowede.framework.ititit.storage.mapper

import io.reactivex.Single
import mowede.framework.ititit.exceptions.NetworkException
import java.io.IOException

object ErrorMapper  {
    fun <T> mapNetworkError(error: Throwable): Single<T> {
        return when (error) {
            is IOException -> Single.error(NetworkException())
            else -> Single.error(error)
        }
    }
}