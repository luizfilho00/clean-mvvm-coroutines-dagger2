package com.example.multimoduleapp.data.util

abstract class Mapper<I, O> {
    abstract fun transform(item: I): O
}