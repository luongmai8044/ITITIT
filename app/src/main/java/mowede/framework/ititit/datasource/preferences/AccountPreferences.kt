package mowede.framework.ititit.datasource.preferences

import android.content.SharedPreferences
import mowede.framework.ititit.repository.model.TokenData
import mowede.framework.ititit.repository.model.User
import javax.inject.Inject

interface AccountPreferences {
    fun getTokenData(): TokenData?
    fun getProfile(): User?
}

const val PREF_ACCESS_TOKEN = "access_token"
const val PREF_REFRESH_TOKEN = "refresh_token"
const val PREF_USER_NAME = "user_name"

class AccountPreferencesImpl @Inject constructor(private val pref: SharedPreferences) : AccountPreferences {
    override fun getTokenData(): TokenData? {
        return if (pref.getString(PREF_ACCESS_TOKEN, null) != null) {
            TokenData(
                    accessToken = pref.getString(PREF_ACCESS_TOKEN, null),
                    refreshToken = pref.getString(PREF_REFRESH_TOKEN, null)
            )
        } else null
    }

    override fun getProfile(): User? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}