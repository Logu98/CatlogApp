package com.example.catlogapp.repository

import com.example.catlogapp.ProductApi
import com.example.catlogapp.model.Product

class ProductRepositoryIImpl @Inject constructor(
    private val productApi: ProductApi
) : ProductRepository {
    override suspend fun getProducts(): List<Product> {
        return productApi.getProducts()
    }

    override suspend fun getProductById(id: Int): Product {
        return productApi.getProductById(id)
    }
}