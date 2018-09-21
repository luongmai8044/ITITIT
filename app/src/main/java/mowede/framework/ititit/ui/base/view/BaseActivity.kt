package mowede.framework.ititit.ui.base.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import dagger.android.AndroidInjection
import mowede.framework.ititit.util.extension.ProgressBarFragment

abstract class BaseActivity : AppCompatActivity(), MVPView, BaseFragment.CallBack {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        performDI()
    }

    override fun hideProgress() {
        fragmentManager.findFragmentByTag(ProgressBarFragment.TAG)?.let {
            fragmentManager.beginTransaction().remove(it).commit()
        }
    }

    override fun showProgress() {
        hideProgress()
        ProgressBarFragment.newInstance().show(supportFragmentManager, ProgressBarFragment.TAG)
    }

    private fun performDI() = AndroidInjection.inject(this)

}