package com.ecom.data.repository.composite

import com.ecom.data.repository.local.UserRepositoryLocal
import com.ecom.data.repository.remote.UserRepositoryRemote
import com.ecom.domain.entities.User
import com.ecom.domain.repository.UserRepository
import javax.inject.Inject

class UserRepositoryComposite @Inject constructor(
    private val local: UserRepositoryLocal,
    private val remote: UserRepositoryRemote
) : UserRepository{
    override suspend fun RegisterUser(user: User) {
        TODO("Not yet implemented")
    }

    override suspend fun LoginUser(email: String, password: String): String? {
        TODO("Not yet implemented")
    }

}