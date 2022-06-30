package ru.netology

interface Attachment {
    abstract val type: String

    data class Video(
        val id: Int,
        val ownerId: Int,
        val title: String,
        val description: String,
        val image: Array<Image>,
        val firstFrame: Array<firstFrame>,


        ) : Attachment {
        override val type = "video"
    }

    data class Photo(
        val id: Int,
        val albumId: Int,
        val ownerId: Int,
        val userId: Int,
        val text: String,
        val date: Int

    ) : Attachment {
        override val type = "photo"
    }

    data class Audio(
        val id: Int,
        val ownerId: Int,
        val artist: String,
        val title: String,
        val duration: Int
    ) : Attachment {
        override val type = "audio"
    }

    data class File(
        val id: Int,
        val ownerId: Int,
        val title: String,
        val size: Int,
        val ext: String,
        val url: String,
        val date: Int,
        val typeFile: Int
    ) : Attachment {
        override val type = "file"
    }

    data class Image(
        val height: Int,
        val url: String,
        val width: Int,
        val withPadding: Int
    )

    data class firstFrame(
        val height: Int,
        val url: String,
        val width: Int
    )
}