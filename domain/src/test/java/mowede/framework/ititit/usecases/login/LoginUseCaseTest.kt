package mowede.framework.ititit.usecases.login

import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import io.reactivex.Completable
import io.reactivex.observers.TestObserver
import mowede.framework.ititit.exceptions.ValidationException
import mowede.framework.ititit.managers.UserManager
import mowede.framework.ititit.usecases.SchedulerProvider
import mowede.framework.ititit.validators.LoginParamValidator
import mowede.framework.ititit.validators.LoginParamValidatorImpl
import org.jbehave.core.annotations.BeforeStories
import org.jbehave.core.annotations.Given
import org.jbehave.core.annotations.Then
import org.jbehave.core.annotations.When
import org.jbehave.core.steps.Steps
import org.mockito.Mock
import org.mockito.MockitoAnnotations

class LoginUseCaseTest : Steps() {

    @Mock
    lateinit var schedulerProvider: SchedulerProvider

    @Mock
    lateinit var userManager: UserManager

    var loginParamValidator: LoginParamValidator = LoginParamValidatorImpl()

    lateinit var useCase: LoginUseCase
    lateinit var loginData : LoginUseCase.InputData
    lateinit var loginTestObserver: TestObserver<Void>

    @BeforeStories
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        useCase = LoginUseCase(schedulerProvider, userManager, loginParamValidator)
    }

    @Given("user name and password are empty")
    fun userNameAndPasswordAreEmpty(){
        loginData = LoginUseCase.InputData("", "")
    }

    @When("user do login system with data empty")
    fun userLoginWithUserAndPasswordEmpty() {
        var loginCompletable = useCase.createCompletable(loginData)
        loginTestObserver = loginCompletable.test()
    }

    @Then("an error is throw")
    fun verifyValidationExceptionIsThrow(){
        loginTestObserver.assertError(ValidationException::class.java)
    }

    @Given("user name and password are valid")
    fun userNameAndPasswordAreValid(){
        loginData = LoginUseCase.InputData("luong.mai", "maria.ozawa")
    }

    @When("user do login system with valid data")
    fun userLoginWithUserAndPasswordValid() {
        whenever(userManager.performLogin(loginData.userName, loginData.password)).thenReturn(Completable.complete())
        var loginCompletable = useCase.createCompletable(loginData)
        loginTestObserver = loginCompletable.test()
    }

    @Then("user login successful")
    fun verifyLoginRequestIsPerform(){
        verify(userManager).performLogin("luong.mai", "maria.ozawa")
        loginTestObserver.assertError(ValidationException::class.java)
        loginTestObserver.assertComplete()
    }
}