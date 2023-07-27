package com.example.ktconsole

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import com.example.ktconsole.console.io.out as _print


fun root(){
    _print("${Thread.currentThread()} has run1.")
    val job = GlobalScope.launch {
        for (i in 1..100){
            delay(10000)
            _print("number is $i at ${i*1000} milli seconds")
        }

    }
}