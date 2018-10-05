package mowede.framework.ititit.ui.base

import android.widget.Toast
import mowede.framework.ititit.R
import mowede.framework.ititit.presentation.NetworkView

abstract class NetworkActivity : DIActivity(), NetworkView {
    override fun showNoInternetConnectionError() {
        Toast.makeText(this, R.string.error_no_internet, Toast.LENGTH_LONG).show()
    }
}