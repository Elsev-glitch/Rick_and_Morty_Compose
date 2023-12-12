package com.project.rickandmorty.domain.usecases

import androidx.paging.PagingData
import com.project.rickandmorty.domain.models.Character
import com.project.rickandmorty.domain.repositories.CharacterRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCharactersUseCase @Inject constructor(
    private val repository: CharacterRepository,
) {

    suspend operator fun invoke(): Flow<PagingData<Character>> = repository.getCharacters()
}