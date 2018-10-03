package mowede.framework.ititit.datasource.local

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import mowede.framework.ititit.datasource.local.options.Options
import mowede.framework.ititit.datasource.local.options.OptionsDao
import mowede.framework.ititit.datasource.local.questions.Question
import mowede.framework.ititit.datasource.local.questions.QuestionsDao


@Database(entities = [(Question::class), (Options::class)], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun optionsDao(): OptionsDao

    abstract fun questionsDao(): QuestionsDao

}