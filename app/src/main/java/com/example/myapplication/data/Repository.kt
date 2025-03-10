package com.example.myapplication.data

data class Repository(
    val id: Int,
    val name: String,
    val description: String?,
    val owner: String,
    val stars: Int,
    val language: String?,
    val forks: Int,
    val isPrivate: Boolean
) 