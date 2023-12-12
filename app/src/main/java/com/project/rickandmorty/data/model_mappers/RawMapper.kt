package com.project.rickandmorty.data.model_mappers

import com.project.rickandmorty.data.entities.CharacterEntity
import com.project.rickandmorty.data.entities.LocationForEntity
import com.project.rickandmorty.data.entities.OriginForEntity
import com.project.rickandmorty.data.models.RawCharacter
import com.project.rickandmorty.data.models.RawLocation
import com.project.rickandmorty.data.models.RawOrigin

fun RawCharacter.toCharacterEntity() = CharacterEntity(
    id = id,
    name = name,
    status = status,
    species = species,
    type = type,
    gender = gender,
    origin = origin?.toOriginForEntity(),
    location = location?.toLocationForEntity(),
    image = image,
    episode = episode,
    url = url,
    created = created
)

fun RawOrigin.toOriginForEntity() = OriginForEntity(
    name = name,
    url = url
)

fun RawLocation.toLocationForEntity() = LocationForEntity(
    name = name,
    url = url
)