package mowede.framework.ititit.ui.login

import dagger.Module
import dagger.Provides
import mowede.framework.ititit.ui.login.interactor.LoginInteractor
import mowede.framework.ititit.ui.login.interactor.LoginMVPInteractor
import mowede.framework.ititit.ui.login.presenter.LoginMVPPresenter
import mowede.framework.ititit.ui.login.presenter.LoginPresenter

@Module
class LoginActivityModule {

    @Provides
    internal fun provideLoginInteractor(interactor: LoginInteractor): LoginMVPInteractor = interactor

    @Provides
    internal fun provideLoginPresenter(presenter: LoginPresenter)
            : LoginMVPPresenter = presenter

}