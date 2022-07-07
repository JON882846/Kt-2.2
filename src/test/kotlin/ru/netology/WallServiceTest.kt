package ru.netology

import Exseption.PostNotFoundException
import org.junit.Test
import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {

        val service = WallService(postIndex)

        val post = Post(
            ownerId = 1,
            fromId = 1,
            createdBy = 1,
            date = 1,
            text = "ppppppppppppppppp",
            replyOwnerId = 1,
            replyPostId = 1,
            friendsOnly = false,
            comments = Post.Comments(),
            copyright = Post.Copyright(),
            likes = Post.Likes(),
            reposts = Post.Reposts(),
            views = Post.Views(),
            postType = Post.PostType.Post,
            signerId = 1,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = Post.Donut(),
            postponedId = 1,
            arrayAttachment = arrayOf()
        )

        val result = service.add(post)

        assertNotEquals(0, result.id)
    }

    @Test
    fun updateTrue() {


        val service = WallService(postIndex)

        service.add(
            Post(
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1,
                text = "ppppppppppppppppp",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = true,
                comments = Post.Comments(),
                copyright = Post.Copyright(),
                likes = Post.Likes(),
                reposts = Post.Reposts(),
                views = Post.Views(),
                postType = Post.PostType.Post,
                signerId = 1,
                canPin = false,
                canDelete = false,
                canEdit = false,
                isPinned = false,
                markedAsAds = false,
                isFavorite = false,
                donut = Post.Donut(),
                postponedId = 1,
                arrayAttachment = arrayOf()
            )
        )

        service.add(
            Post(
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1,
                text = "qqqqqqqqqq",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = false,
                comments = Post.Comments(),
                copyright = Post.Copyright(),
                likes = Post.Likes(),
                reposts = Post.Reposts(),
                views = Post.Views(),
                postType = Post.PostType.Post,
                signerId = 1,
                canPin = false,
                canDelete = false,
                canEdit = false,
                isPinned = false,
                markedAsAds = false,
                isFavorite = false,
                donut = Post.Donut(),
                postponedId = 1,
                arrayAttachment = arrayOf()
            )
        )

        service.add(
            Post(
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1,
                text = "fffffffffffffff",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = false,
                comments = Post.Comments(),
                copyright = Post.Copyright(),
                likes = Post.Likes(),
                reposts = Post.Reposts(),
                views = Post.Views(),
                postType = Post.PostType.Post,
                signerId = 1,
                canPin = false,
                canDelete = false,
                canEdit = false,
                isPinned = false,
                markedAsAds = false,
                isFavorite = false,
                donut = Post.Donut(),
                postponedId = 1,
                arrayAttachment = arrayOf()
            )
        )

        val update = Post(
            id = 2,
            ownerId = 1,
            fromId = 1,
            createdBy = 1,
            date = 1,
            text = "ppppppppppppppppp",
            replyOwnerId = 1,
            replyPostId = 1,
            friendsOnly = false,
            comments = Post.Comments(),
            copyright = Post.Copyright(),
            likes = Post.Likes(),
            reposts = Post.Reposts(),
            views = Post.Views(),
            postType = Post.PostType.Post,
            signerId = 1,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = Post.Donut(),
            postponedId = 1,
            arrayAttachment = arrayOf()
        )

        val result = service.update(update)

        assertTrue(result)


    }

    @Test
    fun updateFalse() {
        val service = WallService(postIndex)

        service.add(
            Post(
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1,
                text = "ppppppppppppppppp",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = false,
                comments = Post.Comments(),
                copyright = Post.Copyright(),
                likes = Post.Likes(),
                reposts = Post.Reposts(),
                views = Post.Views(),
                postType = Post.PostType.Post,
                signerId = 1,
                canPin = false,
                canDelete = false,
                canEdit = false,
                isPinned = false,
                markedAsAds = false,
                isFavorite = false,
                donut = Post.Donut(),
                postponedId = 1,
                arrayAttachment = arrayOf()
            )
        )

        service.add(
            Post(
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1,
                text = "qqqqqqqqqq",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = false,
                comments = Post.Comments(),
                copyright = Post.Copyright(),
                likes = Post.Likes(),
                reposts = Post.Reposts(),
                views = Post.Views(),
                postType = Post.PostType.Post,
                signerId = 1,
                canPin = false,
                canDelete = false,
                canEdit = false,
                isPinned = false,
                markedAsAds = false,
                isFavorite = false,
                donut = Post.Donut(),
                postponedId = 1,
                arrayAttachment = arrayOf()
            )
        )

        service.add(
            Post(
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1,
                text = "fffffffffffffff",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = false,
                comments = Post.Comments(),
                copyright = Post.Copyright(),
                likes = Post.Likes(),
                reposts = Post.Reposts(),
                views = Post.Views(),
                postType = Post.PostType.Post,
                signerId = 1,
                canPin = false,
                canDelete = false,
                canEdit = false,
                isPinned = false,
                markedAsAds = false,
                isFavorite = false,
                donut = Post.Donut(),
                postponedId = 1,
                arrayAttachment = arrayOf()
            )
        )

        val update = Post(
            id = 5,
            ownerId = 1,
            fromId = 1,
            createdBy = 1,
            date = 1,
            text = "ppppppppppppppppp",
            replyOwnerId = 1,
            replyPostId = 1,
            friendsOnly = false,
            comments = Post.Comments(),
            copyright = Post.Copyright(),
            likes = Post.Likes(),
            reposts = Post.Reposts(),
            views = Post.Views(),
            postType = Post.PostType.Post,
            signerId = 1,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = Post.Donut(),
            postponedId = 1,
            arrayAttachment = arrayOf()
        )

        val result = service.update(update)

        assertFalse(result)
    }


    @Test(expected = PostNotFoundException::class)
    fun createComment() {
        val service = WallService(postIndex)
        val comment = Comment(
            5,
            874,
            53542,
            "Котлин",
            8544,
            8778,
           "World"
        )
        val expectedValue = comment
        val realValue = service.createComment(10, comment)

        assertEquals(expectedValue, realValue)
    }

}
