package mowede.framework.ititit.ui.login.interactor

import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single
import mowede.framework.ititit.data.domain.Users
import mowede.framework.ititit.ui.base.interactor.MVPInteractor

interface LoginMVPInteractor : MVPInteractor {

    fun doServerLoginApiCall(email: String, password: String): Single<Users>

    fun doFBLoginApiCall(): Completable

    fun doGoogleLoginApiCall(): Completable

}