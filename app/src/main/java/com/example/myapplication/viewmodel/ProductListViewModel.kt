package com.example.myapplication.viewmodel

import androidx.lifecycle.ViewModel
import com.example.myapplication.data.Product
import com.example.myapplication.data.ProductRepository

class ProductListViewModel : ViewModel() {
    private val repository = ProductRepository()
    
    val products: List<Product> = repository.getProducts()
} 