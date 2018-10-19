package com.kuloglu.example.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.kuloglu.example.db.dao.ExampleDao
import com.kuloglu.example.db.entities.Example

@Database(entities = arrayOf(Example::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun exampleDao(): ExampleDao
}