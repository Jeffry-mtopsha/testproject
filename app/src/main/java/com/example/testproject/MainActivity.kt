package com.example.testproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.testproject.ui.theme.TestProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            John()

        }
    }
}



@Preview
@Composable
fun John(){





    Column(

        modifier = Modifier
            .background(Color.Black)
            .fillMaxWidth()
            .fillMaxHeight(),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom





    )


    {
//        val images = LocalContext.current
//
//        Button(
//            onClick ={
//                images.startActivity(Intent(images, imageActivity::class.java))
//            })
//
//        { Text(text = "Images")
//
//        }



        val about = LocalContext.current

       Button(onClick = {
              about.startActivity(Intent(about, AboutActivity::class.java))

       }) {
            val mm = LocalContext.current
            Text(text = "Cards",
                modifier = Modifier
                    .clickable { mm.startActivity(Intent(mm, CardsActivity::class.java)) }



                )

       }















        Text("This is the about screen",

            fontSize = 20.sp,
            color = Color.Green,
            fontFamily = FontFamily.Monospace,
            fontStyle = FontStyle.Italic,



            )







    }
















}







    
    
    
    
    
    
    
    
    
    

    


