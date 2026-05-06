package com.ecom.data.api

import com.ecom.data.model.remote.order.OrderDetailDto
import com.ecom.data.model.remote.order.OrderDto
import retrofit2.http.GET
import retrofit2.http.Path

interface OrderApi {
    @GET("orders/get-by-user/{userId}")
    suspend fun getOrdersByUserId(@Path("userId") userId: String): List<OrderDto>

    @GET("orders/get-by-id/{orderId}")
    suspend fun getOrderById(@Path("orderId") orderId: String): OrderDetailDto
}