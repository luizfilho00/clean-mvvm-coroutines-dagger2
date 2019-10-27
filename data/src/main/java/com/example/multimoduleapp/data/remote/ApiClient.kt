package com.example.multimoduleapp.data.remote

import com.example.multimoduleapp.data.entity.ApiTodo
import com.example.multimoduleapp.data.util.RequestHandler
import javax.inject.Inject

class ApiClient @Inject constructor(
    private val apiService: ApiService
) : RequestHandler() {

    suspend fun getTodo(): ApiTodo? {
        return makeRequest(apiService.getTodo())
    }
}