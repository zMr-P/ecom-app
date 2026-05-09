package com.ecom.data.repository.remote

import com.ecom.domain.entities.User
import com.ecom.domain.repository.UserRepository
import com.ecom.domain.util.Result

class UserRepositoryRemote : UserRepository {
    override suspend fun registerUser(user: User): Result<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun loginUser(email: String, password: String): Result<String> {
        TODO("Not yet implemented")
    }
}