package com.ecom.data.model.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDateTime

@Entity(tableName = "orders")
data class OrderEntity(
    @PrimaryKey
    val id: String,
    val userId: String,
    val addressId: String,
    val status: String,
    val totalAmount: Double,
    val createdAt: String,
    val updatedAt: String? = null
)