package com.alisadmitrieva.trainingapp.feature_note.domain.usecase

import com.alisadmitrieva.trainingapp.feature_note.domain.model.Note
import com.alisadmitrieva.trainingapp.feature_note.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}