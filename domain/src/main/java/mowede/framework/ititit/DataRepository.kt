package mowede.framework.ititit

import io.reactivex.Single
import mowede.framework.ititit.model.User

interface DataRepository {
    fun login(username: String, password: String): Single<User>
}
