package com.example.data.repo

import com.example.data.remote.ApiService
import com.example.domain.entity.CategoriesResponse
import com.example.domain.repo.MealsRepo

class MealsRepoImpl(private val apiService: ApiService): MealsRepo {
    override fun getMealsFromRemote(): CategoriesResponse = apiService.getMeals()
}