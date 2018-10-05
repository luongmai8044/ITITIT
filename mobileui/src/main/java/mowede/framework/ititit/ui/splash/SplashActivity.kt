package mowede.framework.ititit.ui.splash

import android.os.Bundle
import mowede.framework.ititit.R
import mowede.framework.ititit.di.component.AppComponent
import mowede.framework.ititit.presentation.login.LoginPresenter
import mowede.framework.ititit.presentation.splash.SplashView
import mowede.framework.ititit.ui.base.DIActivity
import javax.inject.Inject

class SplashActivity : DIActivity(), SplashView {
    @Inject lateinit var presenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
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

    override fun navigateToHome() {

    }

    override fun navigateToLogin() {

    }
}
