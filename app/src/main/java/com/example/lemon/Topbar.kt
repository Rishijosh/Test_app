package com.example.myapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.lemon.R

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopBar(
    onMenuClick: () -> Unit = {},
    onShoppingCartClick: () -> Unit = {}
) {
    CenterAlignedTopAppBar(
        navigationIcon = {
            IconButton(onClick = onMenuClick) {
                Icon(
                    painter = painterResource(id = R.drawable.menu_24dp_e8eaed_fill0_wght400_grad0_opsz24),
                    contentDescription = "Menu Icon",
                    tint = Color.White
                )
            }
        },
        title = {
            // Here you can place a logo image in the center:

        },
        actions = {
            IconButton(onClick = onShoppingCartClick) {
                Icon(
                    painter = painterResource(id = R.drawable.local_mall_24dp_e8eaed_fill0_wght400_grad0_opsz24),
                    contentDescription = "Shopping Cart",
                    tint = Color.White
                )
            }
        },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = Color(0xFF495E57) // Just an example color
        )
    )
}