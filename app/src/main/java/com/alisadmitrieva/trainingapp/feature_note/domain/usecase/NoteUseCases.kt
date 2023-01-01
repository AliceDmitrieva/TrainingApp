package com.alisadmitrieva.trainingapp.feature_note.domain.usecase

data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote,
)