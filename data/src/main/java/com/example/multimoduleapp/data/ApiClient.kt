package com.example.multimoduleapp.data

import javax.inject.Inject

class ApiClient @Inject constructor(
    private val apiService: ApiService
) : RequestHandler() {

    suspend fun getTodo(): ApiTodo? {
        return makeRequest(apiService.getTodo())
    }
}