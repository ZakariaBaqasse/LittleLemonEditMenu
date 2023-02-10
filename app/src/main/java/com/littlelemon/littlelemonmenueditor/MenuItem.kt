package com.littlelemon.littlelemonmenueditor

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "menu_item")
data class MenuItem(
    @PrimaryKey
    val id: String,
    val name: String,
    val price: Double
)
