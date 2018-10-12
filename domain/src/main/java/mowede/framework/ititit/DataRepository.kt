package mowede.framework.ititit

import io.reactivex.Completable
import io.reactivex.Single
import mowede.framework.ititit.model.User

interface DataRepository {
    fun login(username: String, password: String): Single<User>

    fun registerConsumer(username: String, password: ByteArray) : Completable
}
