package com.example.lab1

import androidx.annotation.ColorInt

data class NewsItem(
    val title: String,
    val description: String,
    val imageResId: Int,
    @ColorInt val tintColor: Int
)