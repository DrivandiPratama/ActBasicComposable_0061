package com.example.Pertemuan3.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import com.example.Pertemuan3.R

@Composable
fun TataletakTugas(modifier: Modifier = Modifier) {

    val background = painterResource(id = R.drawable.bgimage)
    val logo = painterResource(id = R.drawable.notasibalok  )
    val profpic = painterResource(id = R.drawable.newpic)

    Box(
        modifier = modifier.fillMaxSize()
    ) {

        Image(
            painter = background,
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Login",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Green
            )
            Text(
                text = "Ini adalah halaman login",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(25.dp))

            Image(
                painter = logo,
                contentDescription = null,
                modifier = Modifier
                    .height(150.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "Nama",
                fontSize = 16.sp,
                color = Color.Cyan
            )

            Text(
                text = "Drivandi Pratama",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Green
            )

