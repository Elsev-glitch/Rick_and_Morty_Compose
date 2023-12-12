package com.project.rickandmorty.data.model_mappers

import com.project.rickandmorty.data.entities.CharacterEntity
import com.project.rickandmorty.data.entities.LocationForEntity
import com.project.rickandmorty.data.entities.OriginForEntity
import com.project.rickandmorty.domain.models.Character
import com.project.rickandmorty.domain.models.Location
import com.project.rickandmorty.domain.models.Origin

fun CharacterEntity.toCharacter() = Character(
    id = id ?: 0,
    name = name.orEmpty(),
    status = status.orEmpty(),
    species = species.orEmpty(),
    type = type.orEmpty(),
    gender = gender.orEmpty(),
    origin = origin?.toOrigin(),
    location = location?.toLocation(),
    image = image.orEmpty(),
    episode = episode.orEmpty(),
    url = url.orEmpty(),
    created = created.orEmpty()
)

fun OriginForEntity.toOrigin() = Origin(
    name = name.orEmpty(),
    url = url.orEmpty()
)

fun LocationForEntity.toLocation() = Location(
    name = name.orEmpty(),
    url = url.orEmpty()
)