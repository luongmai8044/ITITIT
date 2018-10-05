package mowede.framework.ititit.ui.login

import android.os.Bundle
import mowede.framework.ititit.di.component.AppComponent
import mowede.framework.ititit.presentation.login.LoginPresenter
import mowede.framework.ititit.presentation.login.LoginView
import mowede.framework.ititit.ui.base.NetworkActivity
import javax.inject.Inject

class LoginActivity : NetworkActivity(), LoginView {

    @Inject lateinit var presenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.view = this
    }

    override fun onStart() {
        super.onStart()
        presenter.start()
    }

    override fun onStop() {
        presenter.stop()
        super.onStop()
    }

    override fun performInjection(appComponent: AppComponent) {
        appComponent.inject(this)
    }

    override fun showValidationError() {

    }

    override fun navigateToHome() {

    }

}