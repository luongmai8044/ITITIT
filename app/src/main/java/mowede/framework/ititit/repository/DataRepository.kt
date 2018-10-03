package mowede.framework.ititit.repository

import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single
import mowede.framework.ititit.datasource.local.options.Options
import mowede.framework.ititit.datasource.local.questions.Question
import mowede.framework.ititit.datasource.remote.request.LoginRequest
import mowede.framework.ititit.datasource.remote.response.LoginResponse
import mowede.framework.ititit.datasource.remote.response.LogoutResponse
import mowede.framework.ititit.repository.model.User
import mowede.framework.ititit.util.AppConstants
import retrofit2.http.Body

interface DataRepository{

    fun logout() : Completable

    fun performServerLogin(@Body request: LoginRequest.ServerLoginRequest): Single<User>

    fun performFBLogin(@Body request: LoginRequest.FacebookLoginRequest): Single<User>

    fun performGoogleLogin(@Body request: LoginRequest.GoogleLoginRequest): Single<User>

    fun loadOptions(questionId: Long): Single<List<Options>>

    fun loadQuestions(): Observable<List<Question>>

    fun isOptionsRepoEmpty(): Observable<Boolean>

    fun insertOptions(options: List<Options>): Observable<Boolean>

    fun isQuestionsRepoEmpty(): Observable<Boolean>

    fun insertQuestions(questions: List<Question>): Observable<Boolean>

    fun updateUserInformation(user : User, loggedInMode: AppConstants.LoggedInMode)
}