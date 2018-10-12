package mowede.framework.ititit.model

data class Consumer(override val name: String,
                    override val email: String,
                    override val userId: String) : User(name, email, userId)