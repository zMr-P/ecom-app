package com.ecom.domain.usecase.orders

import com.ecom.domain.entities.Order
import com.ecom.domain.repository.OrderRepository
import java.util.UUID

class GetOrdersByUserUseCase(private val repository: OrderRepository) {
    suspend operator fun invoke(userId: UUID): List<Order> {
        return repository.getOrdersByUserId(userId);
    }
}