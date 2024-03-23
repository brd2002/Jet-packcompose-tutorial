    package com.example.jetpackcomposetutorial

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetutorial.ui.theme.JetPackcomposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            InputText()
            sayBharat()
        }
    }
}

    @Preview(showBackground = true , name = "my name message" , widthDp = 500 , heightDp = 500)
@Composable
fun sayBharat(){
   Column(
       verticalArrangement = Arrangement.Center,
       horizontalAlignment = Alignment.CenterHorizontally
   ) {
       Text(text = "bharat")
        Text(text = "kisan")}
}
@Composable
    fun InputText(){
        val state = remember {
            mutableStateOf("")
        }
    TextField(
        value = state.value,
        onValueChange = {
            state.value = it
            Log.d("bharat", it)
        },
        label = { Text(text = "enter message") },
    )
    }
//    @Preview(showBackground = true , name = "my message")
//    @Composable
//    fun sayMyMessage(name : String = "what is your name "){
//        Text(text = name)
//    }