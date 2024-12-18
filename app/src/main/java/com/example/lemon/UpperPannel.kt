package com.example.lemon

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable
fun upperPannel() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .background(Color(0xFF495E57))
            .fillMaxWidth()
            .statusBarsPadding()
            .padding(start = 16.dp, end = 16.dp, top = 1.dp, bottom = 16.dp)
    ) {
        Text(
            text = stringResource(id = R.string.Title),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFF4CE14)
        )
        Text(
            modifier = Modifier.padding(top = 8.dp),
            text = stringResource(R.string.H2),
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            color = Color(0xFFFFFFFF)
        )
        Row(
            modifier = Modifier.padding(top = 12.dp)
        ) {
            Text(
                text = stringResource(R.string.Descripton),
                color = Color(0xFFFFFFFF),
                fontSize = 14.sp,
                fontWeight = FontWeight.Light,
                modifier = Modifier.fillMaxWidth(0.6f)
            )
            Image(
                painter = painterResource(R.drawable.corndogs),
                contentDescription = "",
                modifier = Modifier
                    .size(140.dp)
                    .fillMaxWidth(0.4f)
                    .clip(RoundedCornerShape(12.dp))
            )
        }
        Button(
            onClick = {
                Toast.makeText(context, "Order Successful!", Toast.LENGTH_SHORT).show()
            },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF4CE14)),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text(
                text = stringResource(R.string.order),
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFF0333333)
            )
        }

    }
}