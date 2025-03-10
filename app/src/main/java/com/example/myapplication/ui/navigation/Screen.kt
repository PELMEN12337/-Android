package com.example.myapplication.ui.navigation

sealed class Screen(val route: String) {
    object ProductList : Screen("productList")
    object ProductDetail : Screen("productDetail/{productId}") {
        fun createRoute(productId: Int) = "productDetail/$productId"
    }
} 