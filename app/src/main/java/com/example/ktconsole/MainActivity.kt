package com.example.ktconsole

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.Modifier
import com.example.ktconsole.console.io.out
import com.example.ktconsole.ui.MainScreen


class MainActivity : ComponentActivity() {
    init {
        root()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen(modifier=Modifier)
        }
    }
}





