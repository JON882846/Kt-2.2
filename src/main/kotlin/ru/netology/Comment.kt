package ru.netology

data class Comment(
    val id: Int,
    val from_id: Int,
    val date: Int,
    val text:String,
    val reply_to_user:Int,
    val reply_to_comment:Int,
    val guid:String
)

