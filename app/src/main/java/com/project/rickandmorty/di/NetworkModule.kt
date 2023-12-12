package com.project.rickandmorty.di

import com.lenta.rickandmorty.BuildConfig

class NetworkModule {

    fun provideBaseUrl(): String = BuildConfig.BASE_URL
}