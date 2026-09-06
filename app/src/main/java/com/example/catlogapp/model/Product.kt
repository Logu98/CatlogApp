package com.example.catlogapp.model

import android.media.Image

data class Product(
    val id: Int,
    val title: String,
    val description: String,
    val price: Double,
    val image: Image
)