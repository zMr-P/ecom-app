package com.ecom.domain.repository

import com.ecom.domain.entities.User

interface UserRepository {
    suspend fun RegisterUser(user: User)
    suspend fun LoginUser(email: String, password: String): String?
}