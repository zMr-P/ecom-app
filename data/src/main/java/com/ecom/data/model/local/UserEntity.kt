package com.ecom.data.model.local

import androidx.room.Entity

@Entity(tableName = "users")
data class UserEntity (
    val id: String,
    val name: String,
    val email: String,
    val role: String,
    val createdAt: String,
    val updateAt: String,
)