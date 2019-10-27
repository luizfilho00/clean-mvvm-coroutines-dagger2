package com.example.multimoduleapp.data.remote

import com.example.multimoduleapp.data.entity.ApiTodo
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("todos/1")
    suspend fun getTodo(): Response<ApiTodo>
}