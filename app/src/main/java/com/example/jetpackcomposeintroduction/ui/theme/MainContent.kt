package com.example.jetpackcomposeintroduction.ui.theme

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MainContent() {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {

    }
}

@Preview
@Composable
fun MainPreview(){
    MainContent()
}