package mowede.framework.ititit.presentation.splash

import mowede.framework.ititit.presentation.Presenter
import mowede.framework.ititit.presentation.View

interface SplashView : View {
    fun navigateToHome()
    fun navigateToLogin()
}

interface SplashPresenter: Presenter<SplashView>