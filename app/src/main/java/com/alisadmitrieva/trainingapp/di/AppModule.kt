package com.alisadmitrieva.trainingapp.di

import com.alisadmitrieva.trainingapp.data.remote.ExercisesApi
import com.alisadmitrieva.trainingapp.data.repository.ExercisesRepositoryImpl
import com.alisadmitrieva.trainingapp.domain.repository.ExercisesRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideExercisesApi(): ExercisesApi? {
        return null
    }

    @Provides
    @Singleton
    fun provideExercisesRepository(api: ExercisesApi): ExercisesRepository {
        return ExercisesRepositoryImpl(api)
    }
}