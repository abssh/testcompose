package com.example.ktconsole.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ktconsole.viewmodel.viewModel


@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
) {
    val lines = viewModel.output.observeAsState(initial = emptyList())
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 15.dp)
            .then(modifier)
    ) {
        Text("Output:", modifier = Modifier.padding(15.dp))
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 15.dp)
                .background(Color(0xFF111111))
        ) {
            LazyColumn(
                modifier = Modifier.padding(15.dp)
            ) {
                items(lines.value) { l ->
                    Text(
                        text = "$ ${l.value}",
                        fontSize= 16.sp,
                        color = Color(0xFFffccaa,
                        )
                    )
                }
            }
        }
    }
}