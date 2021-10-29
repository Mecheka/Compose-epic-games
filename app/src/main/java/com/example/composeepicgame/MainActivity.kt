package com.example.composeepicgame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeepicgame.ui.theme.ComposeEpicGameTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeEpicGameTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun HomeAppBar(title: String, openSearch: () -> Unit, openFilter: () -> Unit) {
    TopAppBar(
        title = { Text(text = title, color = Color.White) },
        backgroundColor = Color(0xFFF50057),
        actions = {
            IconButton(onClick = openSearch) {
                Icon(imageVector = Icons.Filled.Search, contentDescription = "Search", tint = Color.White)
            }

            IconButton(onClick = openFilter) {
                Icon(imageVector = Icons.Filled.Favorite, contentDescription = "Filter", tint = Color.White)
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeEpicGameTheme {
        Greeting("Android")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHomeAppBar() {
    HomeAppBar(title = "Android", openSearch = { /*TODO*/ }) {
    }
}
