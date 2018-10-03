package mowede.framework.ititit.ui.base.interactor

import mowede.framework.ititit.repository.AppDataRepository
import mowede.framework.ititit.datasource.preferences.PreferenceHelper
import mowede.framework.ititit.util.AppConstants

open class BaseInteractor(val preferenceHelper: PreferenceHelper, val dataRepository: AppDataRepository)
    : MVPInteractor {

    override fun isUserLoggedIn() = this.preferenceHelper.getCurrentUserLoggedInMode() != AppConstants.LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT.type

    override fun performUserLogout() = preferenceHelper.let {
        it.setCurrentUserId(null)
        it.setAccessToken(null)
        it.setCurrentUserEmail(null)
        it.setCurrentUserLoggedInMode(AppConstants.LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT)
    }

}