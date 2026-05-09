package com.ecom.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ecom.data.dao.AddressDao
import com.ecom.data.dao.UserDao
import com.ecom.data.model.local.AddressEntity
import com.ecom.data.model.local.OrderEntity
import com.ecom.data.model.local.UserEntity

@Database(
    entities = [
        UserEntity::class,
        OrderEntity::class,
        AddressEntity::class
    ], version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun addressDao(): AddressDao
}