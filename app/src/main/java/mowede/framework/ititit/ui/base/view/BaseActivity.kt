package mowede.framework.ititit.ui.base.view

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import dagger.android.AndroidInjection
import io.reactivex.Completable
import io.reactivex.disposables.CompositeDisposable
import mowede.framework.ititit.di.SessionExpiredChannel
import mowede.framework.ititit.util.extension.ProgressBarFragment
import javax.inject.Inject
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper



abstract class BaseActivity : AppCompatActivity(), MVPView, BaseFragment.CallBack {

    @Inject @field:SessionExpiredChannel
    lateinit var sessionExpiredChannel: Completable

    @Inject
    lateinit var compositeDisposable: CompositeDisposable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        performDI()
        compositeDisposable.add(sessionExpiredChannel.subscribe(
                // TODO: Show session timeout message
        ))
    }

    override fun onDestroy() {
        compositeDisposable.dispose()
        super.onDestroy()
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

    override fun showError(error : Throwable) {
        hideProgress()
        Toast.makeText(this, error.message, Toast.LENGTH_LONG).show()
    }

    private fun performDI() = AndroidInjection.inject(this)

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase))
    }

}