package com.jakey.compose.presentation.players

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jakey.compose.domain.model.Player
import com.jakey.compose.domain.repository.PlayersRepository
import com.jakey.compose.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class PlayerViewModel @Inject constructor(
    private val playersRepository: PlayersRepository
) : ViewModel() {

    var state by mutableStateOf(PlayersUiState())

    var query by mutableStateOf("asd")

    init {
        loadPlayers()
    }

    fun loadPlayers() = viewModelScope.launch {
        playersRepository.getPlayers().collectLatest {result ->
            Timber.tag("LoadPlayersViewModel").i("data: ${result.data} message: ${result.message}")
            state = state.copy(isLoading = true)
            delay(500L)
            when (result) {
                is Resource.Success -> {
                    state = state.copy(players = result.data ?: listOf(), isLoading = false)
                }
                is Resource.Error -> {
                    state = state.copy(isLoading = false, error = result.message)
                }
                is Resource.Loading -> {
                }
            }
        }
    }
}

data class PlayersUiState(
    val players: List<Player>? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)