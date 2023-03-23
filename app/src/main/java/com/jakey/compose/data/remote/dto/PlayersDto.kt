package com.jakey.compose.data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PlayersDto(
    @Json(name = "copyright")
    val copyright: String = "",
    @Json(name = "people")
    val people: List<People> = listOf()
)