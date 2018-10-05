package mowede.framework.ititit.managers

import io.reactivex.Completable
import mowede.framework.ititit.model.User

interface UserManager {
    fun performLogin(username: String, password: String): Completable
    fun isLoggedIn(): Boolean
    fun getCurrentUser(): User?
}