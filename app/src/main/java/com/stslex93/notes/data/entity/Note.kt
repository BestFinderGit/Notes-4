package com.stslex93.notes.data.entity

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.stslex93.notes.utilites.lowerContains
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "note_table")
data class Note(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Int = 0,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "content") val content: String,
    @ColumnInfo(name = "datestamp") val datestamp: String,
    @ColumnInfo(name = "timestamp") val timestamp: String,
) : Parcelable {
    fun checkTitleContentContains(text: String): Boolean =
        title.lowerContains(text = text) || content.lowerContains(text = text)

}