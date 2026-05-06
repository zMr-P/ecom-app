package com.ecom.data.model.remote.order

import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.UUID

data class OrderDto(
    val id: UUID,
    val userId: UUID,
    val orderStatus: String,
    val totalAmount: BigDecimal,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime? = null
)