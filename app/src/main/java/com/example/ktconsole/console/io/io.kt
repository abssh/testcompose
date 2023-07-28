package com.example.ktconsole.console.io

import com.example.ktconsole.console.models.Line
import com.example.ktconsole.viewmodel.viewModel

fun out(line: Any){
    viewModel.addLine(Line(line.toString()))
}

fun asyncOut(line: Any){
    viewModel.addLineWithDelay(Line(line.toString()))
}