package mowede.framework.ititit.ui.login.view

import mowede.framework.ititit.ui.base.view.EventMVPView

interface LoginMVPView : EventMVPView {

    fun showValidationMessage(errorCode: Int)
    fun openMainActivity()
    fun showAnError()
    fun notifyNewUserLogin()
}