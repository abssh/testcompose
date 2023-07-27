package com.example.ktconsole.console.io

import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.ktconsole.console.models.Line
import com.example.ktconsole.viewmodel.viewModel

fun out(line: Any){
    viewModel.addLine(Line(line.toString()))
}