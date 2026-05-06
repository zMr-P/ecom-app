package com.ecom.domain.entities

import java.util.UUID

data class Address(
    val id: UUID,
    val street: String,
    val number: Int,
    val city: String,
    val state: String,
    val zipCode: String,
    val country: String
)