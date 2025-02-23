package com.example.coincareapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun Login(){

    var name by remember { mutableStateOf("") }

    Column(){
        TextField(
            value = name,
            onValueChange = {name = it},
            label = { Text("Enter You Name") },
            modifier = Modifier.padding(top = 200.dp, start = 30.dp)
        )
    }
}