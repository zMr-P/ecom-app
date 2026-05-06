package com.ecom.data.repository.remote

import com.ecom.domain.entities.User
import com.ecom.domain.repository.UserRepository

class UserRepositoryRemote : UserRepository{
    override suspend fun RegisterUser(user: User) {
        TODO("Not yet implemented")
    }

    override suspend fun LoginUser(email: String, password: String): String? {
        TODO("Not yet implemented")
    }
}