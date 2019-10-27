package com.example.multimoduleapp.domain.interactor

import com.example.multimoduleapp.domain.boundary.TodoRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class GetTodo @Inject constructor(
    private val repository: TodoRepository
) {

    suspend fun execute() = withContext(Dispatchers.IO) { repository.getTodo() }
}