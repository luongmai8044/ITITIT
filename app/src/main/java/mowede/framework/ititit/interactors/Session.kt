package mowede.framework.ititit.interactors

import mowede.framework.ititit.datasource.preferences.PreferenceHelper
import javax.inject.Inject

interface Session {

    fun isLoggedIn(): Boolean
    fun invalidate()
    fun saveToken(token: String?)
    fun getEmail(): String?
    fun getToken(): String?

}

class UserSession @Inject constructor(private val preferenceHelper: PreferenceHelper) : Session {

    override fun getToken(): String? {
        return preferenceHelper.getAccessToken()
    }

    override fun getEmail(): String? {
        return preferenceHelper.getCurrentUserEmail()
    }

    override fun saveToken(token: String?) {
        preferenceHelper.setAccessToken(token)
    }

    override fun invalidate() {
        preferenceHelper.setAccessToken(null)
        preferenceHelper.setCurrentUserEmail(null)
        preferenceHelper.setCurrentUserName(null)
        preferenceHelper.setCurrentUserId(null)
    }

    override fun isLoggedIn(): Boolean = getToken() != null
}