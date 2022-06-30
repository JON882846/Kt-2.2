package ru.netology


class WallService {
    private var posts = emptyArray<Post>()
    private var uniqueId = 0

    fun add(post: Post): Post {
        uniqueId++
        val addedPost = post.copy(id = uniqueId)
        posts += addedPost
        println(posts.size)
        println(posts.last())
        return posts.last()
    }

    fun update(post: Post): Boolean {
        val postId = post.component1()
        val updatePost = post
        for ((index, post) in posts.withIndex()) {
            if (post.id == postId) {
                posts[index] = post.copy(
                    fromId = updatePost.fromId,
                    createdBy = updatePost.createdBy,
                    text = updatePost.text,
                    replyOwnerId = updatePost.replyOwnerId,
                    replyPostId = updatePost.replyPostId,
                    friendsOnly = updatePost.friendsOnly,
                    comments = updatePost.comments,
                    copyright = updatePost.copyright,
                    likes = updatePost.likes,
                    reposts = updatePost.reposts,
                    views = updatePost.views,
                    postType = updatePost.postType,
                    signerId = updatePost.signerId,
                    canPin = updatePost.canPin,
                    canDelete = updatePost.canDelete,
                    canEdit = updatePost.canEdit,
                    isPinned = updatePost.isPinned,
                    markedAsAds = updatePost.markedAsAds,
                    isFavorite = updatePost.isFavorite,
                    postponedId = updatePost.postponedId,
                    arrayAttachment = updatePost.arrayAttachment
                )
                return true
            }
        }
        return false

    }
}