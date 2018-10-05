package mowede.framework.ititit.ui.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import mowede.framework.ititit.App
import mowede.framework.ititit.di.component.AppComponent
import mowede.framework.ititit.presentation.View

abstract class DIActivity : AppCompatActivity(), View {

    private lateinit var appComponent: AppComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appComponent = (application as App).appComponent

        performInjection(appComponent)
    }

    override fun showProgress() {

    }

    override fun hideProgress() {

    }

    override fun showUnexpectedError() {

    }

    abstract fun performInjection(appComponent: AppComponent)
}