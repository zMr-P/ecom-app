package com.ecom.data.repository.local

import com.ecom.data.dao.UserDao
import com.ecom.data.mapper.local.toEntity
import com.ecom.domain.entities.User
import com.ecom.domain.repository.UserRepository
import com.ecom.domain.util.Result
import javax.inject.Inject

class UserRepositoryLocal @Inject constructor(private val userDao: UserDao) : UserRepository {
    override suspend fun registerUser(user: User): Result<Unit> {
        try {
            val userEntity = user.toEntity()

            val userResponse = userDao.insertUser(userEntity)

            return Result.Success(Unit)
        } catch (e: Exception) {
            return Result.Error(e)
        }
    }

    override suspend fun loginUser(email: String, password: String): Result<String> {
        TODO("Not yet implemented")
    }
}