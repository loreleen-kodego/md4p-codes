package com.sablot.activity.objects_and_classes.exercises.booktest

// Define data class for a library book
data class LibraryBook(
    val book: Book,
    var status: BookStatus = BookStatus.AVAILABLE
)