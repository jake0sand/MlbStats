package com.jakey.compose.di

import com.jakey.compose.data.repository.PlayersRepositoryImpl
import com.jakey.compose.domain.repository.PlayersRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindPlayerRepository(
        playersRepository: PlayersRepositoryImpl
    ): PlayersRepository
}