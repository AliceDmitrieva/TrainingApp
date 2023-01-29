package com.alisadmitrieva.trainingapp.domain.repository

import com.alisadmitrieva.trainingapp.domain.model.Exercise

interface ExercisesRepository {

    suspend fun getExercises(): List<Exercise>
}