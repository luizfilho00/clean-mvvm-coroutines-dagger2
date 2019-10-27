package com.example.multimoduleapp.data

import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("todos/1")
    suspend fun getTodo(): Response<ApiTodo>
}