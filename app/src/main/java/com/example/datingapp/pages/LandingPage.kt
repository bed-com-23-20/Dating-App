package com.example.datingapp.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.foundation.background
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import com.example.datingapp.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import java.lang.reflect.Modifier
import kotlin.system.exitProcess

@Composable
fun LandingPage(navController: NavController){

    Column(
        modifier = androidx.compose.ui.Modifier.fillMaxSize()
        .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment =  Alignment.CenterHorizontally




    ){
        Text(text = "WELCOME TO", fontSize = 22.sp, fontWeight =  FontWeight.Bold, fontFamily = FontFamily.Serif, fontStyle = FontStyle.Italic)
        Spacer(modifier = androidx.compose.ui.Modifier.height(12.dp))
        Text(text = "SINGLE & SEARCHING", fontSize = 28.sp, fontWeight =  FontWeight.Bold, fontFamily = FontFamily.Serif, color = Color.Red)
        Text(text = "DATING APP", fontSize = 28.sp, fontWeight =  FontWeight.Bold, fontFamily = FontFamily.Serif, color = Color.Red)

        //Spacer(modifier = androidx.compose.ui.Modifier.height(16.dp))

        Image(
            painter = painterResource(id = R.drawable.love_searching),
            contentDescription = "Background Image",
            modifier = androidx.compose.ui.Modifier.size(350.dp),
                //.graphicsLayer(alpha = 0.1f),
            contentScale = ContentScale.Crop
        )

        Text(text = "Are you single and searching \nfor a Lover? Look no further!", fontSize = 20.sp, fontWeight =  FontWeight.Bold, fontFamily = FontFamily.Serif, fontStyle = FontStyle.Italic)

        Spacer(modifier = androidx.compose.ui.Modifier.height(16.dp))

        androidx.compose.material3.Button(
            onClick = {
                navController.navigate("Login_Page")
            },
            modifier = androidx.compose.ui.Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)


        ) {
            Text(
                text = "Get Started",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Serif,
            )
        }

        Spacer(modifier = androidx.compose.ui.Modifier.height(16.dp))

        androidx.compose.material3.Button(
            onClick = {
                exitProcess(0)
            },
            modifier = androidx.compose.ui.Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)


        ) {
            Text(
                text = "Exit",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Serif,
            )
        }
    }

}