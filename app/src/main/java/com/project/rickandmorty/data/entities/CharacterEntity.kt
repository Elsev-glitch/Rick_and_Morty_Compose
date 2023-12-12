package com.project.rickandmorty.data.entities

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "characters")
data class CharacterEntity(
    @PrimaryKey
    val id: Int?,
    val name: String?,
    val status: String?,
    val species: String?,
    val type: String?,
    val gender: String?,
    @Embedded("origin")
    val origin: OriginForEntity?,
    @Embedded("location")
    val location: LocationForEntity?,
    val image: String?,
    val episode: List<String>?,
    val url: String?,
    val created: String?,
)

data class OriginForEntity(
    val name: String?,
    val url: String?,
)

data class LocationForEntity(
    val name: String?,
    val url: String?,
)