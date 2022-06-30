package ru.netology

fun main() {
    val image1 = Attachment.Image(
        100,
        "https://www.netology.ru",
        130,
        1
    )
    val image2 = Attachment.Image(
        130,
        "https://www.netology.ru",
        130,
        1
    )
    val imageArray = arrayOf(image1, image2)

    val firstFrame1 = Attachment.firstFrame(
        1000,
        "https://netology.ru",
        750
    )
    val firstFrame2 = Attachment.firstFrame(
        1678,
        "ya.ru",
        1300
    )
    val firstFrameArray = arrayOf(firstFrame1, firstFrame2)

    val video1 = Attachment.Video(
        12,
        ownerId = 123,
        title = "Видео",
        description = "Описание видео",
        image = imageArray,
        firstFrame = firstFrameArray
    )

    val photo1 = Attachment.Photo(
        16,
        134,
        167,
        89,
        "Какая-то картинка",
        89467
    )

    val audio1 = Attachment.Audio(
        16,
        178,
        "Киркоров",
        "Песня",
        1678
    )

    val file1 = Attachment.File(
        690,
        589,
        "Какой-то файл",
        589,
        ".kt",
        "vk.com",
        4789567,
        4
    )

    val arrayAttachment1 = arrayOf(video1, photo1, audio1, file1)

    val comments1 =  Post.Comments(2, true, true, true, true)
    val copyright1 =  Post.Copyright(123, "www.google.com", "Евгений", "Гугл")
    val likes1 =  Post.Likes(2, true, true, true)
    val reposts1 =  Post.Reposts(1, true)
    val donut1 =  Post.Donut(true, 1000, "Пожалуйста, оформите подписку", true)

    val post1 = Post(
        1,
        1,
        2,
        3,
        1234,
        "Hello World!",
        123,
        245,
        false,
        comments1,
        copyright1,
        likes1,
        reposts1,
        views = Post.Views(),
        postType = Post.PostType.Post,
        24,
        true,
        false,
        false,
        false,
        false,
        true,
        donut1,
        11,
        arrayAttachment1
    )

    val service = WallService()
    service.add(post1)
}