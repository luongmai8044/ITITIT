package mowede.framework.ititit.ui.login.interactor

import io.reactivex.Completable
import mowede.framework.ititit.datasource.remote.request.LoginRequest
import mowede.framework.ititit.interactors.CompletableInteractor
import mowede.framework.ititit.repository.DataRepository
import mowede.framework.ititit.util.AppConstants
import mowede.framework.ititit.util.SchedulerProvider
import javax.inject.Inject

class SocialLoginInteractor @Inject constructor(schedulerProvider: SchedulerProvider,
                                                private val dataRepository: DataRepository)
    : CompletableInteractor<SocialLoginInteractor.Param>(schedulerProvider) {

    override fun createCompletable(data: Param?): Completable {
        checkNotNull(data).let {
            val loginCompletable = when (it.type) {
                SocialType.GOOGLE -> dataRepository.performGoogleLogin(
                        LoginRequest.GoogleLoginRequest(it.socialUserId, it.socialToken)
                )
                SocialType.FACEBOOK -> dataRepository.performFBLogin(
                        LoginRequest.FacebookLoginRequest(it.socialUserId, it.socialToken)
                )
            }
            val loggedInMode = if (it.type == SocialType.GOOGLE)
                AppConstants.LoggedInMode.LOGGED_IN_MODE_GOOGLE else AppConstants.LoggedInMode.LOGGED_IN_MODE_FB
            loginCompletable.doOnSuccess { user -> dataRepository.updateUserInformation(user, loggedInMode) }

            return loginCompletable.toCompletable()
        }
    }

    data class Param(val socialUserId: String, val socialToken: String, val type: SocialType)

    enum class SocialType {
        GOOGLE(), FACEBOOK()
    }
}