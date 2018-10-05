package mowede.framework.ititit.storage

import io.reactivex.Completable
import mowede.framework.ititit.DataRepository
import mowede.framework.ititit.data.source.preferences.UserPreferences
import mowede.framework.ititit.managers.UserManager
import mowede.framework.ititit.model.User
import javax.inject.Inject

class UserManagerImpl @Inject constructor(private val dataRepository: DataRepository,
                                          private val userPreferences: UserPreferences) : UserManager {
    override fun isLoggedIn(): Boolean {
        return userPreferences.getTokenData() != null
    }

    override fun performLogin(username: String, password: String): Completable {
        return dataRepository.login(username, password)
                .doOnSuccess {
                    userPreferences.putProfile(it)
                }.toCompletable()
    }

    override fun getCurrentUser(): User? {
        return userPreferences.getProfile()
    }
}