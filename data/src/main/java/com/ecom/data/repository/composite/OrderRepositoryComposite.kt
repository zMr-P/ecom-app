package com.ecom.data.repository.composite

import com.ecom.data.repository.local.OrderRepositoryLocal
import com.ecom.data.repository.remote.OrderRepositoryRemote
import com.ecom.domain.repository.OrderRepository
import java.util.UUID
import com.ecom.domain.entities.Order
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class OrderRepositoryComposite @Inject constructor(
    private val remote: OrderRepositoryRemote,
    private val local: OrderRepositoryLocal
) : OrderRepository {

    override suspend fun getOrdersByUserId(userId: UUID): List<Order> {
        return remote.getOrdersByUserId(userId)
    }

    override suspend fun getOrderById(orderId: UUID): Order? {
        return remote.getOrderById(orderId)
    }

    override suspend fun createOrder(order: Order) {
        remote.createOrder(order)
    }

    override suspend fun cancelOrder(orderId: UUID) {
        remote.cancelOrder(orderId)
    }
}