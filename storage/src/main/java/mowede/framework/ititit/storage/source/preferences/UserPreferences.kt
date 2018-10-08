package mowede.framework.ititit.storage.source.preferences

import mowede.framework.ititit.model.User
import mowede.framework.ititit.storage.model.TokenData

interface UserPreferences {
    fun getTokenData(): TokenData?
    fun putTokenData(tokenData: TokenData)
    fun getProfile(): User?
    fun putProfile(profile: User)
}