package mowede.framework.ititit.ui.splash.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import mowede.framework.ititit.R
import mowede.framework.ititit.ui.base.view.BaseActivity
import mowede.framework.ititit.ui.login.view.LoginActivity
import mowede.framework.ititit.ui.splash.presenter.SplashMVPPresenter
import timber.log.Timber
import javax.inject.Inject

class SplashMVPActivity : BaseActivity(), SplashMVPView {

    @Inject
    lateinit var presenter: SplashMVPPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        presenter.onAttach(this)
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

    override fun onFragmentDetached(tag: String) {
    }

    override fun onFragmentAttached() {
    }

    override fun showSuccessToast() {
    }

    override fun showErrorToast() {
    }

    override fun openMainActivity() {
        Timber.log(Log.DEBUG,"Opening Main Screen")
    }

    override fun openLoginActivity() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}
