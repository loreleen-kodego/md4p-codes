package com.sablot.activity.objects_and_classes.exercises.booktest


// Define class for a book
class Book(
    val title: String,
    val author: String,
    val publicationDate: String,
    var status: BookStatus = BookStatus.AVAILABLE
)