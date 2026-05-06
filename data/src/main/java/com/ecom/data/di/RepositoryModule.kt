package com.ecom.data.di

import com.ecom.data.repository.composite.OrderRepositoryComposite
import com.ecom.data.repository.composite.UserRepositoryComposite
import com.ecom.domain.repository.OrderRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun bindOrderRepository(
        composite: OrderRepositoryComposite
    ): OrderRepository

    @Binds
    abstract fun bindUserRepository(
        composite: UserRepositoryComposite
    ): OrderRepository
}