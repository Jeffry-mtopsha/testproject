package com.example.testproject

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testproject.ui.theme.TestProjectTheme

class TravelActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
           Travel()
        }
    }
}
@Preview
@Composable

fun Travel(){


        Row(
            modifier = Modifier
                .background(color = Color.White)
                .fillMaxHeight()
                .fillMaxSize()
                .fillMaxWidth(),

            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Top


//

        ) {

            Card(
                colors = CardDefaults.cardColors(Color.Blue),
                elevation = CardDefaults.cardElevation(8.dp)


            ) {

                Text("Hotel")
                Spacer(modifier = Modifier.height(50.dp))
                Spacer(modifier = Modifier.padding(20.dp))


            }

            Card() {

                Text("Flight")
                Spacer(modifier = Modifier.height(50.dp))
                Spacer(modifier = Modifier.padding(20.dp))


            }

            Card() {

                Text("place")
                Spacer(modifier = Modifier.height(50.dp))
                Spacer(modifier = Modifier.padding(20.dp))


            }
            Card() {
                Text("Food")
                Spacer(modifier = Modifier.height(50.dp))
                Spacer(modifier = Modifier.padding(20.dp))


            }

            Text(
                "Where you wanna go,"


            )


        }

        Spacer(modifier = Modifier.height(50.dp))
        Column {

            Row {


                Text("Popular Hotels")


                Spacer(modifier = Modifier.padding(20.dp))

                Image(
                    painter = painterResource(id = R.drawable.francesa),
                    contentDescription = null,
                    modifier = Modifier
                        .size(1800.dp)
                        .clip(RoundedCornerShape(10))
                        .padding(70.dp)
                        .border(1.dp, Color.Cyan)

                )

                Image(
                    painter = painterResource(id = R.drawable.hotel),
                    contentDescription = null,
                    modifier = Modifier
                        .size(1800.dp)
                        .clip(RoundedCornerShape(10))
                        .padding(70.dp)
                        .border(1.dp, Color.Green)
                )


                Text("Hot Deals")
                Spacer(modifier = Modifier.height(50.dp))

                Image(
                    painter = painterResource(id = R.drawable.francesa),
                    contentDescription = null,
                    modifier = Modifier
                        .size(1800.dp)
                        .clip(RoundedCornerShape(10))
                        .padding(70.dp)
                )


            }


        }


    }






































