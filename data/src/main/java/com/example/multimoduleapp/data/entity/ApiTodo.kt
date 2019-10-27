package com.example.multimoduleapp.data.entity

import com.google.gson.annotations.SerializedName

data class ApiTodo(
    @SerializedName("userId") val userId: Long,
    @SerializedName("id") val id: Long,
    @SerializedName("title") val title: String,
    @SerializedName("completed") val completed: Boolean
)