package com.example.domain.repo

import com.example.domain.entity.CategoriesResponse

interface MealsRepo {
    fun getMealsFromRemote(): CategoriesResponse
}