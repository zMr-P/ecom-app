package com.ecom.domain.entities

import java.util.UUID

data class Category(
    val id: UUID,
    val number: String,
    val description: String,
)