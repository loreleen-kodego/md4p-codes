package com.sablot.activity.objects_and_classes.activity


data class Book(
    val title: String,
    val author: String,
    val publicationDate: String,
    var status: BookStatus = BookStatus.AVAILABLE
) {
    override fun toString(): String {
        return "Title: $title, Author: $author, Publication Date: $publicationDate, Status: $status"
    }
}

enum class BookStatus {
    AVAILABLE,
    ON_LOAN
}





