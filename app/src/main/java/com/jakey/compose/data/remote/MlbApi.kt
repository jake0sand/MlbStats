package com.jakey.compose.data.remote

import com.jakey.compose.data.remote.dto.PlayersDto
import com.jakey.compose.util.Resource
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET

interface MlbApi {

    @GET("sports/1/players")
    suspend fun getPlayers(): PlayersDto

}