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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testproject.ui.theme.TestProjectTheme

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            About()

        }
    }
}






@Preview(showBackground = true)
@Composable
fun About(){

  Column(
      
      modifier = Modifier
          .background(Color.Black)
          .fillMaxWidth()
          .fillMaxHeight(),

          horizontalAlignment = Alignment.CenterHorizontally,
          verticalArrangement = Arrangement.Top





        )


//












  {
   Text("This is the about screen",

       fontSize = 20.sp,
       color = Color.Green,
       fontFamily = FontFamily.Monospace,
       fontStyle = FontStyle.Italic,



       )




//
//      val image = LocalContext.current
//      Button(onClick = {
//
//          image.startActivity(Intent(image, imageActivity::class.java))
//
//      }) { Text(text = "image") }



      Spacer(modifier = Modifier.height(70.dp))



      val pp = LocalContext.current
      Text("Main activity",
          modifier = Modifier
              .background(color = Color.Cyan)
              .clickable { pp.startActivity(Intent(pp, MainActivity::class.java)) }


      )
















  }








}

