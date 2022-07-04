package ru.netology


data class PhotoAttachment(
    override val type: String = "Photo",
    val photo: Photo = Photo(1,2,8,7,"SF",7,"hjhhj")
): Attachment

