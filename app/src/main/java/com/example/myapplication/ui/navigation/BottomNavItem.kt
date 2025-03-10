package com.example.myapplication.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home : BottomNavItem(
        route = "home",
        title = "Главная",
        icon = Icons.Default.Home
    )

    object List : BottomNavItem(
        route = "list",
        title = "Список",
        icon = Icons.Default.List
    )
    
    object Cart : BottomNavItem(
        route = "cart",
        title = "Корзина",
        icon = Icons.Default.ShoppingCart
    )
    
    object Profile : BottomNavItem(
        route = "profile",
        title = "Профиль",
        icon = Icons.Default.Person
    )
} 