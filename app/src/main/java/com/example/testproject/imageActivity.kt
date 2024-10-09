package com.example.testproject

import android.content.Intent
import android.graphics.drawable.shapes.OvalShape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testproject.ui.theme.TestProjectTheme

class imageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
           picha()
        }
    }
}
@Preview
@Composable

fun picha(){


    Column() {


        Card (
           colors = CardDefaults.cardColors(Color.Green)
        ){


               val pet = LocalContext.current
               Text("This is a card",
                  modifier = Modifier
                      .clickable { pet.startActivity(Intent(pet, MainActivity::class.java)) }



                   )










        }




























//        Image(
//            painter = painterResource(id =R.drawable.mumaaz ) ,
//            contentDescription =null,
//            modifier = Modifier
//                .size(80.dp)
//                .clip(RoundedCornerShape(10))
//                .padding(10.dp)
//                .border(1.dp, Color.Green)
//                .padding(0.dp)
//        )












    }









}