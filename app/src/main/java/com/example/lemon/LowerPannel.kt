package com.example.lemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun lowerPannel() {
    weeklySpecial()
    menuDish()
}

@Preview
@Composable
fun weeklySpecial() {
    Card(
        modifier = Modifier.fillMaxWidth()
            .padding(top = 16.dp, start = 8.dp, end = 8.dp, bottom = 16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Text(
            text = "Weeky Special",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
        )
    }
}

@Preview()
@Composable
fun menuDish() {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()
        ) {
            Column {
                Text(
                    text = "Green Salad",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "The Famous Greek Salad of crispy lettuce, peppers, olives and our chicago..",
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(top = 6.dp, bottom = 6.dp)
                        .fillMaxWidth(0.75f)
                )
                Text(
                    text = "$12.99",
                    color = Color.Gray,
                    fontWeight = FontWeight.Bold
                )
            }
            Image(
                painter = painterResource(R.drawable.greeksalad),
                contentDescription = ""
            )
        }
    }
}