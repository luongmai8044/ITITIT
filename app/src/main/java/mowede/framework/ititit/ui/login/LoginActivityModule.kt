package mowede.framework.ititit.ui.login

import dagger.Module
import dagger.Provides
import mowede.framework.ititit.ui.login.presenter.LoginMVPPresenter
import mowede.framework.ititit.ui.login.presenter.LoginPresenter

@Module
class LoginActivityModule {

    @Provides
    internal fun provideLoginPresenter(presenter: LoginPresenter)
            : LoginMVPPresenter = presenter

}