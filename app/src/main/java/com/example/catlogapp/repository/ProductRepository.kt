package com.example.catlogapp.repository

import com.example.catlogapp.model.Product

interface ProductRepository {
    suspend fun getProducts(): List<Product>
    suspend fun getProductById(id: Int): Product
}
