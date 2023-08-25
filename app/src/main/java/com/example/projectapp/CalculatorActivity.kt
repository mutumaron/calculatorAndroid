package com.example.projectapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projectapp.ui.theme.ProjectAppTheme

class CalculatorActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Calc()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Calc(){
    var firstNum by remember { mutableStateOf("") }
    var secondNum by remember { mutableStateOf("") }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)) {
        Text(text = "Answer here!",
        color = Color.White,
        fontSize = 45.sp
        )
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedTextField(
            value = "First Number",
            modifier = Modifier
//                .fillMaxWidth()
                .background(Color.LightGray)
                .padding(16.dp),
            label = { Text(text = "Enter first number",
            color = Color.Black,
            fontSize = 30.sp
            )},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            onValueChange = {
                firstNum=it
            } )
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedTextField(
            value = "Second Number",
            modifier = Modifier
//                .fillMaxWidth()
                .background(Color.LightGray)
                .padding(16.dp),
            label = { Text(text = "Enter Second number",
                color = Color.Black,
                fontSize = 30.sp
            )},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            onValueChange = {
                firstNum=it
            } )
        Spacer(modifier = Modifier.height(25.dp))
        OutlinedButton(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
        ) {
            Text(
                text = "+",
                fontFamily = FontFamily.Serif,
                fontSize = 35.sp,
                fontWeight = FontWeight(56)
            )
        }

        Spacer(modifier = Modifier.height(25.dp))
        OutlinedButton(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
        ) {
            Text(
                text = "-",
                fontFamily = FontFamily.Serif,
                fontSize = 35.sp,
                fontWeight = FontWeight(56)
            )
        }

        Spacer(modifier = Modifier.height(25.dp))
        OutlinedButton(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
        ) {
            Text(
                text = "*",
                fontFamily = FontFamily.Serif,
                fontSize = 35.sp,
                fontWeight = FontWeight(56)
            )
        }

        Spacer(modifier = Modifier.height(25.dp))
        OutlinedButton(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
        ) {
            Text(
                text = "/",
                fontFamily = FontFamily.Serif,
                fontSize = 35.sp,
                fontWeight = FontWeight(56)
            )
        }

        Spacer(modifier = Modifier.height(25.dp))
        OutlinedButton(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
        ) {
            Text(
                text = "+",
                fontFamily = FontFamily.Serif,
                fontSize = 35.sp,
                fontWeight = FontWeight(56)
            )
        }

    }
} 


@Preview(showBackground = true)
@Composable
fun CalcPreview() {
    Calc()
}