package mowede.framework.ititit.repository

import mowede.framework.ititit.datasource.preferences.AccountPreferences
import mowede.framework.ititit.repository.model.TokenData
import mowede.framework.ititit.repository.model.User
import javax.inject.Inject

interface UserManager {
    fun getTokenData(): TokenData?
    fun getProfile(): User?
    fun isLoggedIn(): Boolean
}

class UserManagerImpl
@Inject constructor(private val accountPreferences: AccountPreferences): UserManager {
    override fun getTokenData(): TokenData? {
        return accountPreferences.getTokenData()
    }

    override fun getProfile(): User? {
        return accountPreferences.getProfile()
    }

    override fun isLoggedIn(): Boolean {
        return accountPreferences.getTokenData() != null
    }

}