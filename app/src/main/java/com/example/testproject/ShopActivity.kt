package com.example.testproject

import android.content.Intent
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
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
import androidx.compose.ui.unit.sp
import com.example.testproject.ui.theme.TestProjectTheme

class ShopActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            shop()
        }
    }
}




@Preview
@Composable

fun shop() {


    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxWidth()
            .fillMaxHeight()
            .fillMaxSize()


    ) {
         val jeff = LocalContext.current
        Text("Creative toolsfor endless imagination")
        Text("clickable text",
            modifier = Modifier
                .clickable { jeff.startActivity(Intent(jeff, imageActivity::class.java)) }





            )

    }
    Row {

        Button(onClick = {}) { Text("all") }


        Button(onClick = {}) { Text("Apparel") }

        Button(onClick = {}) { Text("Art supplies") }

        Button(onClick = {}) { Text("Furniture") }


    }

    Row {
        Column {
            Image(
                painter = painterResource(id = R.drawable.mumaaz),
                contentDescription = null,
                modifier = Modifier
                    .size(80.dp)
                    .clip(RoundedCornerShape(10))
                    .padding(10.dp)
                    .border(1.dp, Color.Green),


                )
            Spacer(modifier = Modifier.height(70.dp))







            val pp = LocalContext.current
            Text("Go to About activity",
                modifier = Modifier
                    .clickable { pp.startActivity(Intent(pp, AboutActivity::class.java)) }


            )

























        }


    }
}
