package com.ecom.domain.repository

import com.ecom.domain.entities.User
import com.ecom.domain.util.Result

interface UserRepository {
    suspend fun registerUser(user: User): Result<Unit>
    suspend fun loginUser(email: String, password: String): Result<String>
}