package com.example.multimoduleapp

import androidx.lifecycle.*
import com.example.multimoduleapp.domain.entity.Todo
import com.example.multimoduleapp.domain.interactor.GetTodo
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val getTodo: GetTodo
) : ViewModel(), LifecycleObserver {

    val todoLiveData: LiveData<Todo> get() = _todoLiveData
    private val _todoLiveData by lazy { MutableLiveData<Todo>() }

    fun showTodo() {
        viewModelScope.launch {
            getTodo.execute()?.let(_todoLiveData::postValue)
        }
    }
}