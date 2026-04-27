package com.ecom.data.repository.composite

import com.ecom.data.repository.local.OrderRepositoryLocal
import com.ecom.data.repository.remote.OrderRepositoryRemote
import com.ecom.domain.repository.OrderRepository

class OrderRepositoryComposite : OrderRepository {
    private val remote = OrderRepositoryRemote()
    private val local = OrderRepositoryLocal()

    override suspend fun getOrdersByUserId(userId: java.util.UUID): List<com.ecom.domain.model.Order> {
        return remote.getOrdersByUserId(userId)
    }

    override suspend fun getOrderById(orderId: java.util.UUID): com.ecom.domain.model.Order? {
        return remote.getOrderById(orderId)
    }

    override suspend fun createOrder(order: com.ecom.domain.model.Order) {
        remote.createOrder(order)
    }

    override suspend fun cancelleOrder(orderId: java.util.UUID) {
        remote.cancelleOrder(orderId)
    }
}