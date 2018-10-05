package mowede.framework.ititit.data.entity

import mowede.framework.ititit.data.mapper.DomainMappable
import mowede.framework.ititit.model.LoginData

data class LoginResponse(val userId: String,
                         val userName: String,
                         val email: String,
                         val accessToken: String,
                         val refreshToken: String) : DomainMappable<LoginData> {
    override fun transform(): LoginData {
        return LoginData(accessToken, refreshToken, userName, email)
    }
}