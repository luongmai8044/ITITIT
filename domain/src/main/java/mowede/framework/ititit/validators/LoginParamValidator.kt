package mowede.framework.ititit.validators

import javax.inject.Inject

interface LoginParamValidator {
    fun isValidEmail(email: String): Boolean
    fun isValidPassword(password: String): Boolean
}

class LoginParamValidatorImpl @Inject constructor() : LoginParamValidator {

    companion object {
        private const val PASSWORD_MIN_LENGTH = 8
    }

    override fun isValidEmail(email: String): Boolean {
        return email.isNotEmpty()
    }

    override fun isValidPassword(password: String): Boolean {
        return password.length >= PASSWORD_MIN_LENGTH
    }

}