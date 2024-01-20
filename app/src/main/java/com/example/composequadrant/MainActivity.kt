package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column() {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxHeight(0.5f)
                    .weight(1f)
                    .background(Color(0xFFEADDFF))
                    .padding(16.dp)
            ){
                Text(
                    text = stringResource(id = R.string.quadrant_one_heading),
                    style = TextStyle(
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = stringResource(id = R.string.quadrant_one_content),
                    textAlign = TextAlign.Justify
                )
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxHeight(0.5f)
                    .weight(1f)
                    .background(Color(0xFFD0BCFF))
                    .padding(16.dp)
            ){
                Text(
                    text = stringResource(id = R.string.quadrant_two_heading),
                    style = TextStyle(
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = modifier
                        .padding(bottom = 16.dp)
                )
                Text(
                    text = stringResource(id = R.string.quadrant_two_content),
                    textAlign = TextAlign.Justify
                )
            }
        }


        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color(0xFFB69DF8))
                    .padding(16.dp)
            ){
                Text(
                    text = stringResource(id = R.string.quadrant_three_heading),
                    style = TextStyle(
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier
                        .padding(bottom = 16.dp)
                )
                Text(
                    text = stringResource(id = R.string.quadrant_three_content),
                    textAlign = TextAlign.Justify
                )
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color(0xFFF6EDFF))
                    .padding(16.dp)
            ){
                Text(
                    text = stringResource(id = R.string.quadrant_four_heading),
                    style = TextStyle(
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = modifier
                        .padding(bottom=16.dp)
                )
                Text(
                    text = stringResource(id = R.string.quadrant_four_content),
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        Greeting()
    }
}