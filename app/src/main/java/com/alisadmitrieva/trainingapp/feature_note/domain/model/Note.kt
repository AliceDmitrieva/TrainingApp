package com.alisadmitrieva.trainingapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.alisadmitrieva.trainingapp.ui.theme.BabyBlue
import com.alisadmitrieva.trainingapp.ui.theme.LightGreen
import com.alisadmitrieva.trainingapp.ui.theme.RedOrange
import com.alisadmitrieva.trainingapp.ui.theme.RedPink
import com.alisadmitrieva.trainingapp.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null,
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, RedPink, BabyBlue)
    }
}

class InvalidNoteException(message: String): Exception(message)