package com.ymmc.mycomposeapp.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ymmc.mycomposeapp.R
import com.ymmc.mycomposeapp.ui.theme.MyComposeAppTheme

@Composable
fun Greeting(
    name: String,
    modifier: Modifier = Modifier,
    message: String) {
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = "Hello $name!",
            fontSize = 83.sp,
            lineHeight = 116.sp,
            modifier = modifier,
            textAlign = TextAlign.Center
        )
        Text(
            text = message,
            fontSize = 24.sp,
            modifier = modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }

}

@Composable
fun GreetingImage(modifier: Modifier = Modifier ) {
    val image = painterResource(R.drawable.android)
    Column(modifier) {
        Box(modifier.padding(8.dp)) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .padding(8.dp),
                contentScale = ContentScale.Crop,
            )
            Greeting(
                name = "Yas",
                message = "This is a box content",
                modifier = Modifier.padding(8.dp))
        }
        Box(modifier = modifier) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .padding(8.dp),
                contentScale = ContentScale.Crop)

            Greeting(
                name = "Yas",
                message = "This is a box content",
                modifier = Modifier.padding(8.dp))
        }

    }

}
/**
 * GreetingPreview is only for show how it the app looks like to help
 * with the design. The actual value to be show must be pass in the onCreate
 * function.
 */
@Preview(
    showBackground = true,
    showSystemUi = true )
@Composable
fun GreetingPreview() {
    MyComposeAppTheme {
       // Greeting("Yasmmin", message = "Welcome to Compose")
        GreetingImage()
    }
}