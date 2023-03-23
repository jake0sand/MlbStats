package com.jakey.compose.presentation.players

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontVariation.width
import androidx.compose.ui.unit.dp
import com.jakey.compose.presentation.players.composables.PlayerListCard

@Composable
fun MainScreen(
    state: PlayersUiState,
) {
    when {
        state.isLoading == true -> {
            Box(Modifier.fillMaxSize()) {
                CircularProgressIndicator(Modifier.align(Alignment.Center))
            }
        }
        state.players != null -> {
            LazyColumn() {
                item {
                    LRow("jakey", 4)
                }
                items(state.players.size) { index ->
                    PlayerListCard(state.players, index)
                }
            }
        }
        state.error != null -> {
            Box(Modifier.fillMaxSize()) {
                Text(text = state.error, Modifier.align(Alignment.Center))
            }
        }
    }
}

@Composable
fun LazyItemScope.LRow(text: String, fields: Int) {
    LazyRow() {
        items(100) {
            Card(
                Modifier
                    .padding(16.dp)
            ) {
                repeat(fields) {
                    Text(text = text)
                }
            }
        }
    }
}


