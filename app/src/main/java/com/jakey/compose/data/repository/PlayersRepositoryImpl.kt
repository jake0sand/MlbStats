package com.jakey.compose.data.repository

import com.jakey.compose.data.remote.MlbApi
import com.jakey.compose.data.remote.dto.toPlayerList
import com.jakey.compose.domain.model.Player
import com.jakey.compose.domain.repository.PlayersRepository
import com.jakey.compose.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import javax.inject.Inject

class PlayersRepositoryImpl @Inject constructor(
    private val api: MlbApi
): PlayersRepository {
    override suspend fun getPlayers(): Flow<Resource<List<Player>>> = flow {
        try {
            emit(Resource.Success(
                data = api.getPlayers().people.toPlayerList(),
            ))
        } catch (e: IOException) {
            emit(Resource.Error(message = e.message.toString()))
        }
    }
}