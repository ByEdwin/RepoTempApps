package com.example.act1

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.act1.ui.theme.Act1Theme

class MainActivity : ComponentActivity() {

    // Definición de la constante TAG
    companion object {
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
// Rastro de onCreate
        Log.d(TAG, "Creado")

        enableEdgeToEdge()
        setContent {
            Act1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding -> Greeting(
                    name = "Android",
                    modifier = Modifier.padding(innerPadding)
                )
                }
            }
        }
    }

    // Sobrescritura de onStart
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Inicio")
    }

    // Sobrescritura de onResume
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Continuar")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Act1Theme {
        Greeting("Android")
    }
}

FERNANDO URIEL MIRANDA ROMERO
FERNANDO URIEL MIRANDA ROMERO
20:50
package com.example.act1

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.act1.ui.theme.Act1Theme

class MainActivity : ComponentActivity() {

    // Definición de la constante TAG
    companion object {
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
// Rastro de onCreate
        Log.d(TAG, "Creado")

        enableEdgeToEdge()
        setContent {
            Act1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding -> Greeting(
                    name = "Android",
                    modifier = Modifier.padding(innerPadding)
                )
                }
            }
        }
    }

    // Sobrescritura de onStart
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Inicio")
    }

    // Sobrescritura de onResume
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Continuar")
    }

    // Sobrescritura de onPause
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Pausado")
    }

    // Sobrescritura de onStop
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Detenido")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Act1Theme {
        Greeting("Android")
    }
}