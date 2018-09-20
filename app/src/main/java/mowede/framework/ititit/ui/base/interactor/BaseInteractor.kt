package mowede.framework.ititit.ui.base.interactor

import mowede.framework.ititit.data.network.DataRepository
import mowede.framework.ititit.data.preferences.PreferenceHelper
import mowede.framework.ititit.util.AppConstants

open class BaseInteractor(val preferenceHelper: PreferenceHelper, val dataRepository: DataRepository)
    : MVPInteractor {

    override fun isUserLoggedIn() = this.preferenceHelper.getCurrentUserLoggedInMode() != AppConstants.LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT.type

    override fun performUserLogout() = preferenceHelper.let {
        it.setCurrentUserId(null)
        it.setAccessToken(null)
        it.setCurrentUserEmail(null)
        it.setCurrentUserLoggedInMode(AppConstants.LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT)
    }

}