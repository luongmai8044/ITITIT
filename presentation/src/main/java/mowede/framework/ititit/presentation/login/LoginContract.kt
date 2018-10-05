package mowede.framework.ititit.presentation.login

import mowede.framework.ititit.presentation.NetworkView
import mowede.framework.ititit.presentation.Presenter

interface LoginView : NetworkView {
    fun showValidationError()
    fun navigateToHome()
}

interface LoginPresenter : Presenter<LoginView> {
    fun onUserLogIn(username: String, password: String)
}