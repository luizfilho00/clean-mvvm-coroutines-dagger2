package com.example.multimoduleapp.domain.boundary

import com.example.multimoduleapp.domain.entity.Todo

interface TodoRepository {

    suspend fun getTodo(): Todo?
}