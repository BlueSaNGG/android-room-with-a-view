package com.example.android.roomwordssample

import android.app.Application

class WordsApplication : Application() {
    val database by lazy { WordRoomDatabase.getDatabase(this) }
    val respository by lazy { WordRepository(database.wordDao()) }

}