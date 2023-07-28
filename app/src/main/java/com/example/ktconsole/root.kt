package com.example.ktconsole

import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import com.example.ktconsole.console.io.asyncOut as _print2
import com.example.ktconsole.console.io.out as _print


fun root(){
    _print("${Thread.currentThread()} has run1.")
    MainScope().launch { rootClone() }
}

suspend fun rootClone (){
    for (i in 1..100){
        delay(1000)
        _print2("number is $i at ${i*1000} milli seconds")
    }
}