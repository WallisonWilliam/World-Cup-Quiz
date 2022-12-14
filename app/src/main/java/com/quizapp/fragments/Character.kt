package com.quizapp.fragments

import java.io.Serializable

data class Character(
    val name: String,
    val description: String,
    val imageResId: Int
) : Serializable
