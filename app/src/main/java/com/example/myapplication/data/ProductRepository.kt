package com.example.myapplication.data

class ProductRepository {
    fun getProducts(): List<Product> = listOf(
        Product(
            id = 1,
            name = "Смартфон",
            description = "Мощный смартфон с отличной камерой",
            price = 29999.99,
            imageUrl = "https://"
        ),
        Product(
            id = 2,
            name = "Ноутбук",
            description = "Легкий и производительный ноутбук",
            price = 49999.99,
            imageUrl = "https://"
        ),
        Product(
            id = 3,
            name = "Наушники",
            description = "Беспроводные наушники с шумоподавлением",
            price = 12999.99,
            imageUrl = "https://"
        )
    )

    fun getProductById(id: Int): Product? {
        return getProducts().find { it.id == id }
    }
} 
