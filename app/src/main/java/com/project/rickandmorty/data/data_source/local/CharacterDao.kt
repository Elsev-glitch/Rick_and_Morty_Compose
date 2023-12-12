package com.project.rickandmorty.data.data_source.local

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.project.rickandmorty.data.entities.CharacterEntity

@Dao
interface CharacterDao {

    @Query("SELECT * FROM characters")
    fun getPagingSource(): PagingSource<Int, CharacterEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun save(characters: List<CharacterEntity>?)

    @Query("DELETE FROM characters")
    suspend fun clear()

    @Transaction
    suspend fun refresh(characters: List<CharacterEntity>?) {
        clear()
        save(characters)
    }

    suspend fun save(character: CharacterEntity) {
        save(listOf(character))
    }
}