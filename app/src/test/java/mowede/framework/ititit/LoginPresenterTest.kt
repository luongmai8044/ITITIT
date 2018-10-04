package mowede.framework.ititit

import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.argumentCaptor
import com.nhaarman.mockitokotlin2.eq
import com.nhaarman.mockitokotlin2.verify
import io.reactivex.SingleObserver
import io.reactivex.disposables.CompositeDisposable
import junit.framework.Assert
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import mowede.framework.ititit.repository.model.User
import mowede.framework.ititit.ui.login.interactor.LoginParam
import mowede.framework.ititit.ui.login.interactor.ServerLoginInteractor
import mowede.framework.ititit.ui.login.interactor.SocialLoginInteractor
import mowede.framework.ititit.ui.login.presenter.LoginMVPPresenter
import mowede.framework.ititit.ui.login.presenter.LoginPresenter
import mowede.framework.ititit.ui.login.view.LoginMVPView
import mowede.framework.ititit.util.AppConstants
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class LoginPresenterTest {

    private lateinit var loginMVPPresenter: LoginMVPPresenter
    @Mock lateinit var loginInteractor: ServerLoginInteractor
    @Mock lateinit var socialLoginInteractor: SocialLoginInteractor
    private val compositeDisposable = CompositeDisposable()
    @Mock
    lateinit var loginMVPView: LoginMVPView

    @Before
    fun prepareForTest() {
        MockitoAnnotations.initMocks(this)
        loginMVPPresenter = LoginPresenter(compositeDisposable, loginInteractor, socialLoginInteractor)
    }

    @Test
    fun testLoginWithEmptyEmail() {
        // Before
        loginMVPPresenter.onAttach(loginMVPView)

        // Given
        val email = ""
        val password = "123456"

        // When
        loginMVPPresenter.onServerLoginClicked(email, password)

        // Then
        verify(loginMVPView).showValidationMessage(AppConstants.EMPTY_EMAIL_ERROR)
    }

    @Test
    fun testLoginWithEmptyPassword() {
        // Before
        loginMVPPresenter.onAttach(loginMVPView)

        // Given
        val email = "bac@123.com"
        val password = ""

        // When
        loginMVPPresenter.onServerLoginClicked(email, password)

        // Then
        verify(loginMVPView).showProgress()
        verify(loginMVPView).hideProgress()
        verify(loginMVPView).showValidationMessage(AppConstants.EMPTY_PASSWORD_ERROR)
    }

    @Test
    fun testLoginSuccess() {
        // Before
        loginMVPPresenter.onAttach(loginMVPView)

        // Given
        val email = "bac@123.com"
        val password = "123456"

        // Given
        val captor = argumentCaptor<SingleObserver<User>>()

        // When
        loginMVPPresenter.onServerLoginClicked(email, password)

        // Then
        verify(loginInteractor).execute(captor.capture(), any())

        // Given
        captor.firstValue.onSuccess(User("", "", 1L, ""))

        // Then
        verify(loginMVPView).showProgress()
        verify(loginMVPView).hideProgress()
        verify(loginMVPView).openMainActivity()
    }
}
