package com.example.catlogapp

import com.example.catlogapp.model.Product
import retrofit2.http.GET
import retrofit2.http.Query

interface ProductApi {
    @GET("products")
    suspend fun getProducts(
        @Query("limit") limit: Int = 10
    ): List<Product>

    @GET("products/id")
    suspend fun getProductById(
        @Query("id") id: Int
    ): Product
}
