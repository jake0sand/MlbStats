package com.jakey.compose.data.remote.dto


import com.jakey.compose.domain.model.Player
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class People(
    @Json(name = "active")
    val active: Boolean = false,
    @Json(name = "batSide")
    val batSide: BatSide = BatSide(),
    @Json(name = "birthCity")
    val birthCity: String = "",
    @Json(name = "birthCountry")
    val birthCountry: String = "",
    @Json(name = "birthDate")
    val birthDate: String = "",
    @Json(name = "birthStateProvince")
    val birthStateProvince: String = "",
    @Json(name = "boxscoreName")
    val boxscoreName: String = "",
    @Json(name = "currentAge")
    val currentAge: Int = 0,
    @Json(name = "currentTeam")
    val currentTeam: CurrentTeam = CurrentTeam(),
    @Json(name = "draftYear")
    val draftYear: Int = 0,
    @Json(name = "firstLastName")
    val firstLastName: String = "",
    @Json(name = "firstName")
    val firstName: String = "",
    @Json(name = "fullFMLName")
    val fullFMLName: String = "",
    @Json(name = "fullLFMName")
    val fullLFMName: String = "",
    @Json(name = "fullName")
    val fullName: String = "",
    @Json(name = "gender")
    val gender: String = "",
    @Json(name = "height")
    val height: String = "",
    @Json(name = "id")
    val id: Int = 0,
    @Json(name = "initLastName")
    val initLastName: String = "",
    @Json(name = "isPlayer")
    val isPlayer: Boolean = false,
    @Json(name = "isVerified")
    val isVerified: Boolean = false,
    @Json(name = "lastFirstName")
    val lastFirstName: String = "",
    @Json(name = "lastInitName")
    val lastInitName: String = "",
    @Json(name = "lastName")
    val lastName: String = "",
    @Json(name = "link")
    val link: String = "",
    @Json(name = "middleName")
    val middleName: String = "",
    @Json(name = "mlbDebutDate")
    val mlbDebutDate: String = "",
    @Json(name = "nameFirstLast")
    val nameFirstLast: String = "",
    @Json(name = "nameMatrilineal")
    val nameMatrilineal: String = "",
    @Json(name = "nameSlug")
    val nameSlug: String = "",
    @Json(name = "nameSuffix")
    val nameSuffix: String = "",
    @Json(name = "nameTitle")
    val nameTitle: String = "",
    @Json(name = "nickName")
    val nickName: String = "",
    @Json(name = "pitchHand")
    val pitchHand: PitchHand = PitchHand(),
    @Json(name = "primaryNumber")
    val primaryNumber: String = "",
    @Json(name = "primaryPosition")
    val primaryPosition: PrimaryPosition = PrimaryPosition(),
    @Json(name = "pronunciation")
    val pronunciation: String = "",
    @Json(name = "strikeZoneBottom")
    val strikeZoneBottom: Double = 0.0,
    @Json(name = "strikeZoneTop")
    val strikeZoneTop: Double = 0.0,
    @Json(name = "useLastName")
    val useLastName: String = "",
    @Json(name = "useName")
    val useName: String = "",
    @Json(name = "weight")
    val weight: Int = 0
)

fun List<People>.toPlayerList() : List<Player> {
    return this.map {
        Player(
            name = it.fullName,
            batHand = it.batSide.code,
            id = it.id,
            position = "${it.primaryPosition.abbreviation}: ${it.primaryPosition.code}"
        )
    }
}