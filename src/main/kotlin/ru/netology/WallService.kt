package ru.netology

import Exseption.PostNotFoundException

class WallService(
     var postIndex: Array<Int>,
) {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    private var uniqueId = 0

    init {
       this.postIndex = arrayOf(post1.id, post2.id, post3.id)
    }


    fun createComment(postId: Int, comment: Comment): Comment {
        if (postIndex.contains(postId)){
            comments += comment
            return comment
        } else {
            throw PostNotFoundException("NO POST")
        }
    }


    fun add(post: Post): Post {
        uniqueId++
        val addedPost = post.copy(id = uniqueId)
        posts += addedPost
        println(posts.size)
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