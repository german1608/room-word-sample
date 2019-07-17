package com.example.roomwordsample

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface WordDao {
    @Insert
    suspend fun insert(word: Word)

    @Query("delete from word_table")
    fun deleteAll()

    @Query("select * from word_table order by word asc")
    fun getAllWords(): LiveData<List<Word>>
}