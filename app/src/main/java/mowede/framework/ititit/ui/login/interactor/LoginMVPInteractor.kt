package mowede.framework.ititit.ui.login.interactor

import io.reactivex.Completable
import io.reactivex.Single
import mowede.framework.ititit.data.model.User
import mowede.framework.ititit.ui.base.interactor.MVPInteractor

interface LoginMVPInteractor : MVPInteractor {

    fun doServerLoginApiCall(email: String, password: String): Single<User>

    fun doFBLoginApiCall(): Completable

    fun doGoogleLoginApiCall(): Completable

    fun doLogout() : Completable

}