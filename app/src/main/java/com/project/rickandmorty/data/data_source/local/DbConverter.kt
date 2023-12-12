package com.project.rickandmorty.data.data_source.local

import androidx.room.TypeConverter
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken

class DbConverter {

    private val gson = GsonBuilder().create()

    @TypeConverter
    fun fromListToString(data: List<String>?): String =
        gson.toJson(data)

    @TypeConverter
    fun fromStringToList(data: String?): List<String>? =
        data?.let {
            gson.fromJson(it, object : TypeToken<List<String>>() {}.type)
        }
}