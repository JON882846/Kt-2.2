package ru.netology


data class VideoAttachment(
    override val type: String = "Video",
    val video: Video = Video(1,2,"esrsd","klkj","fghfgh")
): Attachment

