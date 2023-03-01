package com.sablot.activity.objects_and_classes.exercises.one

class Book(
    private val isbn: String,
    private val title: String,
    private val author: String,
    private val numberOfPages: Int
) {

    fun printDetails() {
        println("ISBN: $isbn, Title: $title, Author: $author, Pages: $numberOfPages")
    }

    companion object {

    }

    init {

    }
}

fun main() {
    val books = listOf(
        Book("978-0142410370", "The Hunger Games", "Suzanne Collins", 384),
        Book("978-0307474278", "The Girl with the Dragon Tattoo", "Stieg Larsson", 672),
        Book("978-0316278013", "Ready Player Two", "Ernest Cline", 384)
    )

    for (book in books) {
        book.printDetails()
    }
}