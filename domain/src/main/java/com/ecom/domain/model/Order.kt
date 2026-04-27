package com.ecom.domain.model

import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.UUID

data class Order(
    val id: UUID,
    val userId: UUID,
    val items: List<OrderItem> = emptyList(),
    val totalAmount: BigDecimal,
    val shippingAddress: Address,
    val status: OrderStatus,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime? = null
)

enum class OrderStatus {
    PENDING,
    PROCESSING,
    SHIPPED,
    DELIVERED,
    CANCELLED
}