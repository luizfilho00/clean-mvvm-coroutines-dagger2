package com.example.multimoduleapp.di

import com.example.multimoduleapp.data.ApiTodo
import com.example.multimoduleapp.data.ApiTodoToTodoMapper
import com.example.multimoduleapp.data.DefaultTodoRepository
import com.example.multimoduleapp.data.Mapper
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

