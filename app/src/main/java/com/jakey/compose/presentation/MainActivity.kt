package com.jakey.compose.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.jakey.compose.presentation.players.MainScreen
import com.jakey.compose.presentation.players.PlayerViewModel
import com.jakey.compose.presentation.theme.MlbStatsTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MlbStatsTheme() {
                Surface() {
                    val viewModel = hiltViewModel<PlayerViewModel>()
                    MainScreen(state = viewModel.state)
                }
            }
        }
    }
}




