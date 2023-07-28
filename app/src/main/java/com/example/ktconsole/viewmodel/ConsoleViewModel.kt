package com.example.ktconsole.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ktconsole.console.models.Line
import kotlinx.coroutines.launch

class ConsoleViewModel : ViewModel() {
    private val _output = MutableLiveData<List<Line>>()
    val output: LiveData<List<Line>> get() = _output


    fun addLine(line: Line){
        val temp = _output.value.orEmpty().toMutableList()
        temp.add(line)
        _output.value = temp
    }
    fun addLineWithDelay(line: Line){
        viewModelScope.launch {
            addLine(line)
        }
    }

}

val viewModel = ConsoleViewModel()