package com.example.jetpackcomposetutorial

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun NotificationScreen(){
    var count = rememberSaveable{
        mutableStateOf(0)
    }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally ,
        
    ) {
    NotificationCounter((count.value)) { count.value++ }
        MessageBar(count.value)
    }
}
@Composable
fun NotificationCounter(count: Int, increment: () -> Int) {

    Column(verticalArrangement = Arrangement.Center) {
        Text(text = "You have sent ${count} notifications")
        Button(onClick = {
            increment()
        }) {
            Text(text = "Send Notification")
        }
    }
}
@Composable
fun MessageBar(count: Int) {
    Card(
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Row(modifier = androidx.compose.ui.Modifier.padding(8.dp) ,
            verticalAlignment = Alignment.CenterVertically) {
            Image(
                imageVector = Icons.Outlined.Favorite,
                contentDescription = "" ,
                modifier = androidx.compose.ui.Modifier.padding(7.dp)
            )
            Text(text = "Message send so far - ${count}")
        }
    }
}