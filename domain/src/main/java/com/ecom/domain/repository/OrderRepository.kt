package com.ecom.domain.repository

import com.ecom.domain.entities.Order
import java.util.UUID

interface OrderRepository {
    suspend fun getOrdersByUserId(userId: UUID): List<Order>
    suspend fun getOrderById(orderId: UUID): Order?
    suspend fun createOrder(order: Order)
    suspend fun cancelOrder(orderId: UUID)
}