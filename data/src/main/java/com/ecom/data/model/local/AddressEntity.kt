package com.ecom.data.model.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "addresses")
data class AddressEntity(
    @PrimaryKey
    val id: String,
    val userId: String,
    val street: String,
    val number: Int,
    val city: String,
    val state: String,
    val zipCode: String,
    val country: String
)
