package com.example.multimoduleapp.data.util

import kotlinx.coroutines.coroutineScope
import retrofit2.Response

open class RequestHandler {

    protected suspend fun <T> makeRequest(block: Response<T>): T? {
        return coroutineScope {
            try {
                block.run {
                    if (isSuccessful) {
                        body()
                    } else {
                        throw Exception()
                    }
                }
            } catch (t: Exception) {
                throw t
            }
        }
    }
}