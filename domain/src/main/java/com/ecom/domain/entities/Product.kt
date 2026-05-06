package com.ecom.domain.entities

import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.UUID

data class Product (
    val id: UUID,
    val categoryId: UUID,
    val name: String,
    val description: String,
    val price: BigDecimal,
    val stockQuantity: Int,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime? = null
)