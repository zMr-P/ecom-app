package com.ecom.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.ecom.data.model.local.AddressEntity

@Dao
interface AddressDao {
    @Query("SELECT * FROM addresses WHERE userId = :userId")
    suspend fun getAddressesByUserId(userId: String): List<AddressEntity>

    @Query("SELECT * FROM addresses WHERE id = :addressId")
    suspend fun getAddressById(addressId: String): AddressEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAddress(address: AddressEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAddresses(addresses: List<AddressEntity>)

    @Update
    suspend fun updateAddress(address: AddressEntity)

    @Delete
    suspend fun deleteAddress(address: AddressEntity)
}