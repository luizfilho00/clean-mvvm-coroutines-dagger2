package com.example.multimoduleapp.di

import com.example.multimoduleapp.data.entity.ApiTodo
import com.example.multimoduleapp.data.mappers.ApiTodoToTodoMapper
import com.example.multimoduleapp.data.repository.DefaultTodoRepository
import com.example.multimoduleapp.data.util.Mapper
import com.example.multimoduleapp.domain.boundary.TodoRepository
import com.example.multimoduleapp.domain.entity.Todo
import dagger.Binds
import dagger.Module

@Module
interface ApplicationBindingModule {

    @Binds
    fun bindApiTodoToTodoMapper(mapper: ApiTodoToTodoMapper): Mapper<ApiTodo, Todo>

    @Binds
    fun bindTodoRepository(repository: DefaultTodoRepository): TodoRepository
}

