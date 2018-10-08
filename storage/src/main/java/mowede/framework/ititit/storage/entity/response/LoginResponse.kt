package mowede.framework.ititit.storage.entity.response
import mowede.framework.ititit.model.User
import mowede.framework.ititit.storage.mapper.DomainMappable

data class LoginResponse(val userId: String,
                         val userName: String,
                         val email: String,
                         val accessToken: String,
                         val refreshToken: String) : DomainMappable<User> {
    override fun transform(): User {
        return User(userName, email, userId)
    }
}