package mowede.framework.ititit.storage.source.preferences

import android.content.SharedPreferences
import mowede.framework.ititit.data.source.preferences.UserPreferences
import mowede.framework.ititit.model.User
import mowede.framework.ititit.storage.model.TokenData
import javax.inject.Inject

class UserPreferencesImpl @Inject constructor(private val sharedPreferences: SharedPreferences) : UserPreferences {
    override fun getTokenData(): TokenData? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun putTokenData(tokenData: TokenData) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getProfile(): User? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun putProfile(profile: User) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}