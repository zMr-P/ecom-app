package com.ecom.data.repository.local

import com.ecom.domain.repository.OrderRepository

class OrderRepositoryLocal : OrderRepository {
    override suspend fun getOrdersByUserId(userId: java.util.UUID): List<com.ecom.domain.model.Order> {
        TODO("Not yet implemented")
    }

    override suspend fun getOrderById(orderId: java.util.UUID): com.ecom.domain.model.Order? {
        TODO("Not yet implemented")
    }

    override suspend fun createOrder(order: com.ecom.domain.model.Order) {
        TODO("Not yet implemented")
    }

    override suspend fun cancelleOrder(orderId: java.util.UUID) {
        TODO("Not yet implemented")
    }
}