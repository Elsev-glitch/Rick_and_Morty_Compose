package com.project.rickandmorty.data.repositories

import androidx.paging.PagingData
import com.project.rickandmorty.domain.models.Character
import com.project.rickandmorty.domain.repositories.CharacterRepository
import kotlinx.coroutines.flow.Flow

class CharacterRepositoryImpl : CharacterRepository {

    override fun getCharacters(): Flow<PagingData<Character>> {

    }

}