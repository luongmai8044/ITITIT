package mowede.framework.ititit.di.module

import dagger.Module
import dagger.Provides
import mowede.framework.ititit.validators.LoginParamValidator
import mowede.framework.ititit.validators.LoginParamValidatorImpl

@Module
class DomainModule {
    @Provides
    fun provideLoginParamValidator(loginParamValidatorImpl: LoginParamValidatorImpl) : LoginParamValidator = loginParamValidatorImpl
}