package com.ecom.data.repository.remote

import com.ecom.data.api.OrderApi
import com.ecom.data.mapper.remote.toDomain
import com.ecom.domain.entities.Order
import com.ecom.domain.repository.OrderRepository
import javax.inject.Inject
import java.util.UUID

class OrderRepositoryRemote @Inject constructor(private val orderApi: OrderApi) : OrderRepository {
    override suspend fun getOrdersByUserId(userId: UUID): List<Order> {

        val orderResponse = orderApi.getOrdersByUserId(userId.toString())

        return orderResponse.map{it.toDomain()}
    }

    override suspend fun getOrderById(orderId: UUID): Order? {
        TODO("Not yet implemented")
    }

    override suspend fun createOrder(order: Order) {
        TODO("Not yet implemented")
    }

    override suspend fun cancelOrder(orderId: UUID) {
        TODO("Not yet implemented")
    }
}