package com.example.multimoduleapp.data.mappers

import com.example.multimoduleapp.data.util.Mapper
import com.example.multimoduleapp.data.entity.ApiTodo
import com.example.multimoduleapp.domain.entity.Todo
import javax.inject.Inject

class ApiTodoToTodoMapper @Inject constructor() : Mapper<ApiTodo, Todo>() {

    override fun transform(item: ApiTodo) = Todo(
        userId = item.userId,
        id = item.id,
        title = item.title,
        completed = item.completed
    )
}