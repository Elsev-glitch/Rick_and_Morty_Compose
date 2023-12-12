package com.project.rickandmorty.presentation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.navigation.compose.rememberNavController
import com.project.rickandmorty.presentation.navigation.BottomBar
import com.project.rickandmorty.presentation.navigation.NavigationGraph
import com.project.rickandmorty.R
import com.project.rickandmorty.ui.theme.Red
import com.project.rickandmorty.ui.theme.RickAndMortyTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            RickAndMortyTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            colors = TopAppBarDefaults.topAppBarColors(containerColor = Red),
                            title = {
                                Text(
                                    text = stringResource(id = R.string.rick_and_morty),
                                    color = Color.White
                                )
                            },
                        )
                    },
                    bottomBar = {
                        BottomBar(navController = navController)
                    }
                ) {
                    Box(modifier = Modifier.padding(it)) {
                        NavigationGraph(navController = navController)
                    }
                }
            }
        }
    }
}