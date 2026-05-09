package com.ecom.data.mapper.local

import com.ecom.data.model.local.UserEntity
import com.ecom.domain.entities.User

fun User.toEntity(): UserEntity = UserEntity(
    id = id.toString(),
    name = name,
    email = email,
    role = role,

)