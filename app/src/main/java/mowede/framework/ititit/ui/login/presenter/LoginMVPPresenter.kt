package mowede.framework.ititit.ui.login.presenter

import mowede.framework.ititit.ui.base.presenter.MVPPresenter
import mowede.framework.ititit.ui.login.view.LoginMVPView

interface LoginMVPPresenter : MVPPresenter<LoginMVPView> {

    fun onServerLoginClicked(email: String, password: String)
    fun onFBLoginClicked()
    fun onGoogleLoginClicked()

}