package attachment

data class FileAttachment(
    override val type: String= "File",
    val file: File = File(1,2,"SF",5,"hhb","gjhj",4,5,"juh")
): Attachment
