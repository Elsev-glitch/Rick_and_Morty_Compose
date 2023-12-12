package com.project.rickandmorty.data.models

data class RawCharacter(
    val id: Int?,
    val name: String?,
    val status: String?,
    val species: String?,
    val type: String?,
    val gender: String?,
    val origin: RawOrigin?,
    val location: RawLocation?,
    val image: String?,
    val episode: List<String>?,
    val url: String?,
    val created: String?,
)

data class RawOrigin(
    val name: String?,
    val url: String?,
)

data class RawLocation(
    val name: String?,
    val url: String?,
)