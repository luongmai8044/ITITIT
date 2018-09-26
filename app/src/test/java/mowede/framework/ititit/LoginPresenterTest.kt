package mowede.framework.ititit

import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import io.reactivex.Single
import io.reactivex.disposables.CompositeDisposable
import mowede.framework.ititit.data.model.User
import mowede.framework.ititit.ui.login.interactor.LoginInteractor
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
    @Mock
    lateinit var loginInteractor: LoginInteractor
    private val compositeDisposable = CompositeDisposable()
    @Mock
    lateinit var loginMVPView: LoginMVPView

    @Before
    fun prepareForTest() {
        MockitoAnnotations.initMocks(this)
        loginMVPPresenter = LoginPresenter(loginInteractor, compositeDisposable)
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
        val loginSingle = Single.just(User("bac", "email"))
        whenever(loginInteractor.doServerLoginApiCall(email, password)).thenReturn(loginSingle)

        // When
        loginMVPPresenter.onServerLoginClicked(email, password)

        // Then
        verify(loginMVPView).showProgress()
        verify(loginMVPView).hideProgress()
        verify(loginMVPView).openMainActivity()
    }

    @Test
    fun testLoginFailWithNoSuchElementException() {
        // Before
        loginMVPPresenter.onAttach(loginMVPView)

        // Given
        val email = "bac@123.com"
        val password = "123456"

        // Given
        val loginSingle = Single.error<User>(NoSuchElementException())
        whenever(loginInteractor.doServerLoginApiCall(email, password)).thenReturn(loginSingle)

        // When
        loginMVPPresenter.onServerLoginClicked(email, password)

        // Then
        verify(loginMVPView).showProgress()
        verify(loginMVPView).hideProgress()
        verify(loginMVPView).showAnError()
    }
}
