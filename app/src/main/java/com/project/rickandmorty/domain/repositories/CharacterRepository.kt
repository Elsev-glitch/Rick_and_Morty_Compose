package com.project.rickandmorty.domain.repositories

import androidx.paging.PagingData
import com.project.rickandmorty.domain.models.Character
import kotlinx.coroutines.flow.Flow

interface CharacterRepository {

    fun getCharacters(): Flow<PagingData<Character>>
}