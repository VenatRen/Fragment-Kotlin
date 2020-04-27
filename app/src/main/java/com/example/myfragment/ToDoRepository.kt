package com.example.myfragment

import java.util.*

object ToDoRepository {
    private val items = listOf(


        ToDoModel(
            description = "Make room for the video",
            checked = "false",
            id = UUID.randomUUID().toString()
        ),
        ToDoModel(
            description = "Create stream online",
            checked = "false",
            id = UUID.randomUUID().toString()
        ),
        ToDoModel(
            description = "Create video",
            checked = "true",
            id = UUID.randomUUID().toString()
        )


    ).associateBy { it.id }


    fun getItems() = items.values.toList()

    fun getItemById(id:String) = items[id]
}
