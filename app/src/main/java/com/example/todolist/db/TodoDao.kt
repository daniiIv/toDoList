package com.example.todolist.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.todolist.Todo

@Dao
interface TodoDao {
    @Query("SELECT * FROM Todo")
    fun getAllTodo() : LiveData<List<Todo>>

    @Insert
    fun addTodo(todo : Todo)

    @Query("DELETE FROM Todo where id = :id")
    fun deleteTodo(id :Int)
}