package com.alisadmitrieva.trainingapp.domain.use_case

import com.alisadmitrieva.trainingapp.domain.repository.ExercisesRepository

class GetExercisesUseCase(
    private val repository: ExercisesRepository,
) {
    operator fun invoke() {

    }
}