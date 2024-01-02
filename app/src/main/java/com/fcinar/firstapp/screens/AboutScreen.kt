package com.fcinar.firstapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AboutScreen() {
    Column(
        Modifier
            .padding(8.dp)
    ) {
        Text(
            text = "This is About",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
    }
}