package com.alisadmitrieva.trainingapp.data.remote

import com.alisadmitrieva.trainingapp.domain.model.Exercise
import retrofit2.http.GET

interface ExercisesApi {

    @GET("/v1/exercises")
    suspend fun getExercises(): List<Exercise>
}