package com.example.multimoduleapp.data

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