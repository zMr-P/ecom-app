package com.ecom.domain.model

import java.time.LocalDateTime
import java.util.UUID

data class User(
    val id: UUID,
    val name: String,
    val email: String,
    val password: String,
    val role: UserRole,
    val addresses: List<Address> = emptyList(),
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime? = null
)

enum class UserRole {
    CUSTOMER,
    ADMIN
}