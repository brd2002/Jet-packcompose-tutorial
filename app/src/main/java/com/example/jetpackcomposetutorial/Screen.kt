package com.example.jetpackcomposetutorial

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true , showSystemUi = true , name = "recycler view")
@Composable
fun previewItem(){
//    BlogCategory(img = R.drawable.images, title = "Programming", subtitle = "Learn different languages")
    LazyColumn (content = {
        items(getCategory()){
            BlogCategory(img = it.img, title = it.title, subtitle = it.subtitle)
        }
    })
}

@Composable
fun BlogCategory(img: Int , title : String , subtitle :String){
    Card(elevation = CardDefaults.cardElevation(8.dp), modifier = Modifier.padding(8.dp)){
        Row (verticalAlignment = Alignment.CenterVertically ,
            modifier = Modifier.padding(8.dp)){
            Image(
                painter = painterResource(id = img), contentDescription ="" , modifier = Modifier
                    .size(70.dp)
                    .padding(10.dp)
                    .weight(.2f)
                    .clip(CircleShape)
                )
            ItemDescription(title, subtitle , Modifier.weight(0.8f) )
        }
    }
}

@Composable
public fun ItemDescription(title: String, subtitle: String , modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.headlineMedium,
            fontSize = 30.sp
        )
        Text(
            text = subtitle,
            style = MaterialTheme.typography.titleMedium,

            fontSize = 20.sp
        )
    }
}
fun getCategory() : MutableList<Catagory>{
    val list = mutableListOf<Catagory>()
    list.add(Catagory(R.drawable.images , "Bharat ruidas " , "software Engineer"))
    list.add(Catagory(R.drawable.images , "Bharat ruidas " , "software Engineer"))
    list.add(Catagory(R.drawable.images , "Bharat ruidas " , "software Engineer"))
    list.add(Catagory(R.drawable.images , "Bharat ruidas " , "software Engineer"))
    list.add(Catagory(R.drawable.images , "Bharat ruidas " , "software Engineer"))
    list.add(Catagory(R.drawable.images , "Bharat ruidas " , "software Engineer"))
    list.add(Catagory(R.drawable.images , "Bharat ruidas " , "software Engineer"))
    list.add(Catagory(R.drawable.images , "Bharat ruidas " , "software Engineer"))
    list.add(Catagory(R.drawable.images , "Bharat ruidas " , "software Engineer"))
    list.add(Catagory(R.drawable.images , "Bharat ruidas " , "software Engineer"))
    list.add(Catagory(R.drawable.images , "Bharat ruidas " , "software Engineer"))
    list.add(Catagory(R.drawable.images , "Bharat ruidas " , "software Engineer"))
    list.add(Catagory(R.drawable.images , "Bharat ruidas " , "software Engineer"))
    list.add(Catagory(R.drawable.images , "Bharat ruidas " , "software Engineer"))
    list.add(Catagory(R.drawable.images , "Bharat ruidas " , "software Engineer"))
    list.add(Catagory(R.drawable.images , "Bharat ruidas " , "software Engineer"))
    list.add(Catagory(R.drawable.images , "Bharat ruidas " , "software Engineer"))
    list.add(Catagory(R.drawable.images , "Bharat ruidas " , "software Engineer"))
    list.add(Catagory(R.drawable.images , "Bharat ruidas " , "software Engineer"))
    list.add(Catagory(R.drawable.images , "Bharat ruidas " , "software Engineer"))
    list.add(Catagory(R.drawable.images , "Bharat ruidas " , "software Engineer"))
    return list
}