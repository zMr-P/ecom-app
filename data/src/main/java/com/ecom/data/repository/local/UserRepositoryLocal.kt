package com.ecom.data.repository.local

import com.ecom.domain.entities.User
import com.ecom.domain.repository.UserRepository

class UserRepositoryLocal : UserRepository {
    override suspend fun RegisterUser(user: User) {
        TODO("Not yet implemented")
    }

    override suspend fun LoginUser(email: String, password: String): String? {
        TODO("Not yet implemented")
    }
}