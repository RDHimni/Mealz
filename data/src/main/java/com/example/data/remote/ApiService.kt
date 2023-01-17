package com.example.data.remote

import com.example.domain.entity.CategoriesResponse
import retrofit2.http.GET

interface ApiService {
    @GET("categories.php")
    fun getMeals(): CategoriesResponse
}