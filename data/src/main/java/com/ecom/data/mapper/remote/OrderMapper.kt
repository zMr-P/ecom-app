package com.ecom.data.mapper.remote

import com.ecom.data.model.remote.order.OrderDto
import com.ecom.domain.entities.Order
import com.ecom.domain.entities.OrderStatus

fun OrderDto.toDomain(): Order = Order(
    id = id,
    userId = userId,
    status = OrderStatus.valueOf(orderStatus),
    totalAmount = totalAmount,
    createdAt = createdAt,
    updatedAt = updatedAt
)