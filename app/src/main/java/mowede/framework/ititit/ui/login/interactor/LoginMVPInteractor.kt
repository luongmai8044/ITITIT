package mowede.framework.ititit.ui.login.interactor

import io.reactivex.Completable
import io.reactivex.Observable
import mowede.framework.ititit.data.model.User
import mowede.framework.ititit.ui.base.interactor.MVPInteractor

interface LoginMVPInteractor : MVPInteractor {

    fun doServerLoginApiCall(email: String, password: String): Observable<User>

    fun doFBLoginApiCall(): Completable

    fun doGoogleLoginApiCall(): Observable<User>

}