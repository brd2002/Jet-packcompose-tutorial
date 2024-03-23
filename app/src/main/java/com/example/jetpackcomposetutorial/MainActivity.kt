    package com.example.jetpackcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposetutorial.ui.theme.JetPackcomposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text(text = "Hello bharat")
        }
    }
}

    @Preview(showBackground = true , name = "my name message" , showSystemUi = true)
@Composable
fun sayBharat(name : String = "bharat anu"){
    Text(text = name)
}

//    @Preview(showBackground = true , name = "my message")
//    @Composable
//    fun sayMyMessage(name : String = "what is your name "){
//        Text(text = name)
//    }