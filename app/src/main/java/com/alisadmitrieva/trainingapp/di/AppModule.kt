package com.alisadmitrieva.trainingapp.di

import android.app.Application
import androidx.room.Room
import com.alisadmitrieva.trainingapp.feature_note.data.datasource.NoteDatabase
import com.alisadmitrieva.trainingapp.feature_note.data.repository.NoteRepositoryImpl
import com.alisadmitrieva.trainingapp.feature_note.domain.repository.NoteRepository
import com.alisadmitrieva.trainingapp.feature_note.domain.usecase.AddNote
import com.alisadmitrieva.trainingapp.feature_note.domain.usecase.DeleteNote
import com.alisadmitrieva.trainingapp.feature_note.domain.usecase.GetNote
import com.alisadmitrieva.trainingapp.feature_note.domain.usecase.GetNotes
import com.alisadmitrieva.trainingapp.feature_note.domain.usecase.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME,
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(database: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(database.noteDAO)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNotes = GetNotes(repository),
            deleteNote = DeleteNote(repository),
            addNote = AddNote(repository),
            getNote = GetNote(repository),
        )
    }
}