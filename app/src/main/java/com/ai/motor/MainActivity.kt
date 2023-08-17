package com.ai.motor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ai.motor.ui.theme.MotorTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MotorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

//The compiler takes the Kotlin code you wrote, looks at it line by line, and translates it into something that the computer can understand. This process is called compiling your code.


//Every composable should have an optional parameter of the type Modifier. This should be the first optional parameter.
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    //A Modifier is used to augment or decorate a composable.
    //Surface is a container that represents a section of UI where you can alter the appearance, such as the background color or border.
    Surface(color = Color.Cyan) {
        Text(
            text = "Hello $name!",
            modifier = modifier.padding(24.dp)
        )
    }
}

@Preview(showBackground = true) // Preview tells Android Studio that this composable should be shown in the design view of this file.
// If showBackground is set to true, it will add a background to your composable preview.
@Composable // this is Composable annotation that can be call in setContent function or other composable functions
fun GreetingPreview() {
    MotorTheme {
        Greeting("Android")
    }
}