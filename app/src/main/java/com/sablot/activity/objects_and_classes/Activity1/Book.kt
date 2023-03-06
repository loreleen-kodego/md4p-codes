package com.sablot.activity.objects_and_classes.Activity1

class Book(
    val title: String?,
    val author: String?,
    val publicationDate: String?,
    var status: BookStatus
)
{
    override fun toString(): String {
        return "Title: $title, Author: $author, Publication Date: $publicationDate,Status: $status"
    }
}