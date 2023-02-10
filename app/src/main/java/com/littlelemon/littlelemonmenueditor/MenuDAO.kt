package com.littlelemon.littlelemonmenueditor

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface MenuDAO {
    @Query("SELECT * FROM menu_item")
    fun getAllMenuItems():LiveData<List<MenuItem>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveMenuItem(item: MenuItem)

    @Delete
    fun deleteMenuItem(item: MenuItem)
}