package attachment

data class Audio(
    val id: Int,
    val ownerId: Int,
    val artist: String,
    override val type: String
) : Attachment {
    constructor() : this(1,1,"hjh","hjkhj"

    )
}