package com.example.multimoduleapp.data.repository

import com.example.multimoduleapp.data.util.Mapper
import com.example.multimoduleapp.data.entity.ApiTodo
import com.example.multimoduleapp.data.remote.ApiClient
import com.example.multimoduleapp.domain.boundary.TodoRepository
import com.example.multimoduleapp.domain.entity.Todo
import javax.inject.Inject

class DefaultTodoRepository @Inject constructor(
    private val apiClient: ApiClient,
    private val mapper: Mapper<ApiTodo, Todo>
) : TodoRepository {

    override suspend fun getTodo() = apiClient.getTodo()?.let(mapper::transform)
}