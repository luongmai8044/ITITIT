package mowede.framework.ititit.ui.base.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import dagger.android.AndroidInjection
import mowede.framework.ititit.util.extension.ProgressBarFragment
import mowede.framework.ititit.util.CommonUtil

abstract class BaseActivity : AppCompatActivity(), MVPView, BaseFragment.CallBack {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        performDI()
    }

    override fun hideProgress() {
        supportFragmentManager.findFragmentByTag(ProgressBarFragment.TAG)?.let {
            supportFragmentManager.beginTransaction().remove(it).commit()
        }
    }

    override fun showProgress() {
        hideProgress()
        ProgressBarFragment.newInstance().show(supportFragmentManager, ProgressBarFragment.TAG)
    }

    override fun showNetworkError(){
        hideProgress()
        Toast.makeText(this, "Network Error", Toast.LENGTH_LONG).show()
    }

    private fun performDI() = AndroidInjection.inject(this)

}