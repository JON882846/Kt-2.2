package ru.netology

fun main() {
    val video1 = VideoAttachment()

    val audio1 = Audio ( 1,2,"hjg","hjkhk")
    val photo1 = PhotoAttachment()
    val file1 = FileAttachment()

    val arrayAttachment1 = arrayOf(video1,photo1, audio1, file1)

    val comments1 =  Post.Comments(2, canPost = true, groupsCanPost = true, canClose = true, canOpen = true)
    val copyright1 =  Post.Copyright(123, "www.google.com", "Евгений", "Гугл")
    val likes1 =  Post.Likes(2, userLikes = true, canLike = true, canPublish = true)
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
        canPin = true,
        canDelete = false,
        canEdit = false,
        isPinned = false,
        markedAsAds = false,
        isFavorite = true,
        donut = donut1,
        postponedId = 11,
        arrayAttachment = arrayAttachment1
    )

    val service = WallService()
    service.add(post1)
}