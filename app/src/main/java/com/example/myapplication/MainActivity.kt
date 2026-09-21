package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme() {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    BasicComponentsScreen(
//                        modifier = Modifier.padding(innerPadding)
//                    )

                    BasicComponentsScreen2(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


// TELA 2
@Composable
fun BasicComponentsScreen2 (modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize()
            .background(Color(0xFF000000)),
        contentAlignment = Alignment.Center
    ) {
        logoscor()
        Text(
            text = "GAME OVER",
            color = Color.White,
            fontSize = 70.sp,
            fontWeight = FontWeight.SemiBold

        )


    }
}

//@Composable
//fun BasicComponentsScreen (modifier: Modifier = Modifier) {
//    Column(
//        modifier = modifier.fillMaxSize()
//            .background(Color(0xFF000000))
//    ) {
//
//        // Tela 1
//        placar()
//        Spacer(
//            modifier = Modifier.height(30.dp)
//        )
//        logoscor()
//        Spacer(
//            modifier = Modifier.weight(1f)
//        )
//
//        controle()
//
//        Spacer(
//            modifier = Modifier.height(20.dp)
//        )
//
//        start(
//            modifier = Modifier.padding(bottom = 10.dp)
//        )
//
//
//
//    }
//}



//@Composable
//fun placar (modifier: Modifier = Modifier){
//    Row(
//        modifier = modifier.fillMaxWidth(),
//        horizontalArrangement = Arrangement.SpaceBetween
//
//    ) {
//        Text(
//            text = "SCORE: 0050",
//            color = Color.White
//        )
//        Row(
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Text(
//                text = "LIVES:",
//                color = Color.White
//            )
//
//            AndroidEnemy(
//                modifier = Modifier.size(20.dp),
//                color = Color.Green
//            )
//            AndroidEnemy(
//                modifier = Modifier.size(20.dp),
//                color = Color.Green
//            )
//            AndroidEnemy(
//                modifier = Modifier.size(20.dp),
//                color = Color.Green
//            )
//
//        }
//
//    }
//}

@Composable
fun logoscor (modifier: Modifier = Modifier){
    Row(
        modifier = modifier.fillMaxWidth(),

    ) {
        AndroidEnemy(
                modifier = Modifier.size(80.dp),
                color = Color.Green
            )
        AndroidEnemy(
                modifier = Modifier.size(80.dp),
                color = Color.Red
            )
        AndroidEnemy(
                modifier = Modifier.size(80.dp),
                color = Color.Blue
            )
        AndroidEnemy(
            modifier = Modifier.size(80.dp),
            color = Color.Yellow
        )
        AndroidEnemy(
            modifier = Modifier.size(80.dp),
            color = Color.Green
        )

        }
}

//@Composable
//fun controle(modifier: Modifier = Modifier) {
//    Box(
//        modifier = modifier
//            .fillMaxWidth()
//            .height(100.dp),
//        contentAlignment = Alignment.Center
//    ) {
//        Image(
//            painter = painterResource(R.drawable.img),
//            contentDescription = "Controle",
//            modifier = Modifier.size(73.dp)
//        )
//    }
//}

//@Composable
//fun start (modifier: Modifier = Modifier){
//    Row(
//        modifier = modifier
//            .padding(start = 7.dp, end = 7.dp)
//            .fillMaxWidth(),
//
//        ) {
//        Text(
//            text = "PRESS START",
//            fontSize = 25.sp,
//            color = Color.White,
//            modifier = Modifier
//                .height(45.dp)
//                .background(Color.Gray)
//                .wrapContentHeight(Alignment.CenterVertically)
//                .fillMaxWidth(),
//            textAlign = TextAlign.Center,
//
//
//
//        )
//
//    }
//}


@Composable
fun AndroidEnemy(
    color: Color,
    modifier: Modifier = Modifier
){
    Image(
        modifier = modifier,
        painter = painterResource(R.drawable.img_1),
        colorFilter = ColorFilter.tint(color = color),
        contentDescription = "Android Enemy"
    )

}