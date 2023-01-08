package com.alisadmitrieva.trainingapp.feature_note.presentation.add_training

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)