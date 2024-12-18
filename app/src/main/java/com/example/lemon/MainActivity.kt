package com.example.lemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.example.myapp.ui.components.MyTopBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            homeScreen()
        }
    }
}

@Preview
@Composable
fun homeScreen() {
    Scaffold(
        topBar = {
            MyTopBar()
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(
                start = innerPadding.calculateStartPadding(layoutDirection = LayoutDirection.Ltr),
                end = innerPadding.calculateEndPadding(layoutDirection = LayoutDirection.Rtl),
                top = 64.dp, // Reduce gap to a reasonable value
                bottom = innerPadding.calculateBottomPadding()
        ) ){
            upperPannel()
            lowerPannel()
        }
    }
}








