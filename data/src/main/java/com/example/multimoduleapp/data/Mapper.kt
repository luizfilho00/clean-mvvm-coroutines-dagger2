package com.example.multimoduleapp.data

abstract class Mapper<I, O> {
    abstract fun transform(item: I): O
}