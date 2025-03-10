package com.example.myapplication.viewmodel

import androidx.lifecycle.ViewModel
import com.example.myapplication.data.Product
import com.example.myapplication.data.ProductRepository

class ProductDetailViewModel : ViewModel() {
    private val repository = ProductRepository()
    
    fun getProduct(id: Int): Product? = repository.getProductById(id)
} 