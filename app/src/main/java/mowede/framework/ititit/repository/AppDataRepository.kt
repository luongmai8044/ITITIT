package mowede.framework.ititit.repository

import io.reactivex.Completable
import io.reactivex.Flowable
import io.reactivex.Observable
import io.reactivex.Single
import mowede.framework.ititit.datasource.local.LocalDataHelper
import mowede.framework.ititit.datasource.local.options.Options
import mowede.framework.ititit.datasource.local.questions.Question
import mowede.framework.ititit.datasource.preferences.PreferenceHelper
import mowede.framework.ititit.datasource.remote.ApiServiceHelper
import mowede.framework.ititit.datasource.remote.request.LoginRequest
import mowede.framework.ititit.repository.model.User
import mowede.framework.ititit.util.AppConstants
import mowede.framework.ititit.util.RetryWithDelay
import mowede.framework.ititit.util.extension.mapError
import mowede.framework.ititit.util.extension.mapNetworkErrors
import mowede.framework.ititit.util.extension.mapToDomain
import mowede.framework.ititit.util.extension.retry
import retrofit2.HttpException
import java.net.HttpURLConnection
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class AppDataRepository @Inject constructor(private val apiServiceHelper: ApiServiceHelper,
                                            private val preferenceHelper: PreferenceHelper,
                                            private val localDataHelper: LocalDataHelper) : DataRepository {

    override fun isOptionsRepoEmpty(): Observable<Boolean> {
        return localDataHelper.isOptionsRepoEmpty()
    }

    override fun insertOptions(options: List<Options>): Observable<Boolean> {
        return localDataHelper.insertOptions(options)
    }

    override fun isQuestionsRepoEmpty(): Observable<Boolean> {
        return localDataHelper.isQuestionsRepoEmpty()
    }

    override fun insertQuestions(questions: List<Question>): Observable<Boolean> {
        return localDataHelper.insertQuestions(questions)
    }

    override fun loadQuestions(): Observable<List<Question>> {
        return localDataHelper.loadQuestions()
    }

    override fun loadOptions(questionId: Long): Single<List<Options>> {
        return localDataHelper.loadOptions(questionId)
    }

    override fun performServerLogin(request: LoginRequest.ServerLoginRequest): Single<User> {
        return apiServiceHelper.performServerLogin(request)
                .retryWhen(RetryWithDelay(3, 2, TimeUnit.SECONDS))
                .mapNetworkErrors()
                .mapError()
                .mapToDomain()
    }

    override fun performFBLogin(request: LoginRequest.FacebookLoginRequest): Single<User> {
        return apiServiceHelper.performFBLogin(request)
                .retryWhen(RetryWithDelay(3, 2, TimeUnit.SECONDS))
                .mapNetworkErrors()
                .mapError()
                .mapToDomain()
    }

    override fun performGoogleLogin(request: LoginRequest.GoogleLoginRequest): Single<User> {
        return apiServiceHelper.performGoogleLogin(request)
                .retryWhen(RetryWithDelay(3, 2, TimeUnit.SECONDS))
                .mapNetworkErrors()
                .mapError()
                .mapToDomain()
    }

    override fun logout(): Completable {
        return apiServiceHelper.performLogoutApiCall()
    }

    override fun updateUserInformation(user : User, loggedInMode: AppConstants.LoggedInMode) =
            preferenceHelper.let {
                it.setCurrentUserId(user.userId)
                it.setAccessToken(user.accessToken)
                it.setCurrentUserLoggedInMode(loggedInMode)
            }

}