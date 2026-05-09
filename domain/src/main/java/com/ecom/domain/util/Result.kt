package com.ecom.domain.util

sealed class Result<out T> {
    object Loading : Result<Nothing>()
    data class Success<out T>(val data: T? = null) : Result<T>()
    data class Error(val exception: Throwable) : Result<Nothing>()
}