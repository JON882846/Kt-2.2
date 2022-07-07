package ru.netology

import attachment.*

val video1 = VideoAttachment(
    "FHFTH",
)
val audio1 = AudioAttachment()
val photo1 = PhotoAttachment()
val file1 = FileAttachment(
    "hgh",
    File(1,2,"SF",5,"hhb","gjhj",4,5,"juh")
)
val video2 = VideoAttachment()
val audio2 = AudioAttachment()
val photo2 = PhotoAttachment(
    "Photo"
)
val file2 = FileAttachment()

val video3 = VideoAttachment()
val audio3 = AudioAttachment()
val photo3 = PhotoAttachment()
val file3 = FileAttachment()


val arrayAttachment1 = arrayOf(video1,photo1, audio1, file1)
val arrayAttachment2 = arrayOf(video2,photo2, audio2, file2)
val arrayAttachment3 = arrayOf(video3,photo3, audio3, file3)



val comments1 = Post.Comments(2, canPost = true, groupsCanPost = true, canClose = true, canOpen = true)
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

val post2 = Post(
    2,
    5,
    4,
    3,
    1234,
    "Hello Wor!",
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
    arrayAttachment = arrayAttachment2
)

val post3 = Post(
    1,
    1,
    2,
    3,
    1234,
    "Hello",
    13,
    24,
    false,
    comments1,
    copyright1,
    likes1,
    reposts1,
    views = Post.Views(),
    postType = Post.PostType.Post,
    2,
    canPin = true,
    canDelete = false,
    canEdit = false,
    isPinned = false,
    markedAsAds = false,
    isFavorite = true,
    donut = donut1,
    postponedId = 11,
    arrayAttachment = arrayAttachment3
)
var comment = Comment(
    1,45,567,"Hello",89,21,"Здорова"
)
var postIndex: Array<Int> = arrayOf()

fun main() {

    val service = WallService(postIndex)

    comment = service.createComment(3, comment)

    println(service.add(post3))
}

