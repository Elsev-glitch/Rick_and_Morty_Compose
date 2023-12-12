package com.project.rickandmorty.data.data_source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.project.rickandmorty.data.entities.CharacterEntity

@Database(entities = [CharacterEntity::class], version = 1)
@TypeConverters(DbConverter::class)
abstract class RickAndMortyDb : RoomDatabase() {

    abstract fun getCharacterDao(): CharacterDao
}