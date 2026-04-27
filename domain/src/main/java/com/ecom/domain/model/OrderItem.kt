package com.ecom.domain.model

import java.math.BigDecimal
import java.util.UUID

data class OrderItem(
    val orderId: UUID,
    val productId: UUID,
    val quantity: Int,
    val unitPrice: BigDecimal
)