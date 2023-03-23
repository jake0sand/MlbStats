package com.jakey.compose.domain.repository

import com.jakey.compose.domain.model.Player
import com.jakey.compose.util.Resource
import kotlinx.coroutines.flow.Flow

interface PlayersRepository {
    suspend fun getPlayers(): Flow<Resource<List<Player>>>
}