package com.alisadmitrieva.trainingapp.data.repository

import com.alisadmitrieva.trainingapp.data.remote.ExercisesApi
import com.alisadmitrieva.trainingapp.domain.model.Exercise
import com.alisadmitrieva.trainingapp.domain.repository.ExercisesRepository
import javax.inject.Inject

class ExercisesRepositoryImpl @Inject constructor(
    private val api: ExercisesApi,
) : ExercisesRepository {

    override suspend fun getExercises(): List<Exercise> {
        TODO("Not yet implemented")
    }

}