package attachment

data class Video(
    val id: Int,
    val ownerId: Int,
    val artist: String,
    val time: String,
    override val type: String
) : Attachment