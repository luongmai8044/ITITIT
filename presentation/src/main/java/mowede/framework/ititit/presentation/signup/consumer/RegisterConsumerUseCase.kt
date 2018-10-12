package mowede.framework.ititit.presentation.signup.consumer

import io.reactivex.Completable
import mowede.framework.ititit.DataRepository
import mowede.framework.ititit.exceptions.ValidationException
import mowede.framework.ititit.usecases.CompletableUseCase
import mowede.framework.ititit.usecases.SchedulerProvider
import java.util.*

class RegisterConsumerUseCase(schedulerProvider: SchedulerProvider,
                              private val dataRepository: DataRepository): CompletableUseCase<RegisterConsumerUseCase.InputData>(schedulerProvider) {

    override fun createCompletable(data: InputData?): Completable {
        checkNotNull(data).let {
            if (!it.password.contentEquals(it.confirmedPassword)
            && it.username.isNotEmpty()) {
                dataRepository.registerConsumer(it.username, it.password)
            }else{
                Completable.error(ValidationException())
            }
            return Completable.complete()
        }
    }

    data class InputData(val username : String, val password : ByteArray, val confirmedPassword: ByteArray) {

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as InputData

            if (username != other.username) return false
            if (!Arrays.equals(password, other.password)) return false
            if (!Arrays.equals(confirmedPassword, other.confirmedPassword)) return false

            return true
        }

        override fun hashCode(): Int {
            var result = username.hashCode()
            result = 31 * result + Arrays.hashCode(password)
            result = 31 * result + Arrays.hashCode(confirmedPassword)
            return result
        }
    }
}