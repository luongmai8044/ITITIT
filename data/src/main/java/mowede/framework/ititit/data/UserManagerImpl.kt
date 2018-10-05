package mowede.framework.ititit.data

import io.reactivex.Completable
import mowede.framework.ititit.DataRepository
import mowede.framework.ititit.data.source.preferences.AppPreferences
import mowede.framework.ititit.data.source.preferences.UserPreferences
import mowede.framework.ititit.managers.UserManager
import mowede.framework.ititit.model.TokenData
import mowede.framework.ititit.model.User
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserManagerImpl @Inject constructor(private val userPreferences: UserPreferences,
                                          private val appPreferences: AppPreferences,
                                          private val dataRepository: DataRepository)
    : UserManager {
    override fun performLogin(username: String, password: String): Completable {
        return dataRepository.login(username, password)
                .doOnSuccess { response ->
                    val tokenData = TokenData(response.accessToken, response.refreshToken)
                    val profile = User(response.userName, response.email, response.userName)

                    putTokenData(tokenData)
                    setCurrentUser(profile)
                }.toCompletable()
    }

    override fun getTokenData(): TokenData? {
        TODO("not implemented")
    }

    override fun getCurrentUser(): User? {
        TODO("not implemented")
    }

    private fun putTokenData(tokenData: TokenData?) {
        // userPreferences.putTokenData(tokenData)
    }

    private fun setCurrentUser(user: User?) {
        // userPreferences.setProfile(user)
    }

}