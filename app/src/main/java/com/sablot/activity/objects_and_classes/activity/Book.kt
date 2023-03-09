package com.sablot.activity.objects_and_classes.activity


data class Book(
    val title: String,
    val author: String,
    val publicationDate: String,
    val status: BookStatus = BookStatus.AVAILABLE
) {
    override fun toString(): String {
        return "Title: $title, Author: $author, Publication Date: $publicationDate, Status: $status"
    }
}

enum class BookStatus {
    AVAILABLE,
    ON_LOAN
}

val bookList = listOf(
    Book("Noli Me Tangere", "Jose Rizal","1887"),
    Book("El Filibusterismo", "Jose Rizal","1891"),
    Book("Florante at Laura", "Francisco Balagtas","1838"),
    Book("Mga Ibong Mandaragit", "Amado Hernandez","1969"),
    Book("The Woman Who Had Two Navels", "Nick Joaquin","1961")
)



