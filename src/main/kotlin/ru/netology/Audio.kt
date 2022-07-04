package ru.netology

data class Audio(
    val id: Int,
    val ownerId: Int,
    val artist: String,
    override val type: String
) : Attachment