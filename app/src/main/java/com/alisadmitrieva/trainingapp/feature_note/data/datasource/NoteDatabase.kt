package com.alisadmitrieva.trainingapp.feature_note.data.datasource

import androidx.room.Database
import androidx.room.RoomDatabase
import com.alisadmitrieva.trainingapp.feature_note.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1,
)
abstract class NoteDatabase : RoomDatabase() {
    abstract val noteDAO: NoteDAO

    companion object {
        const val DATABASE_NAME = "notes_db"
    }
}