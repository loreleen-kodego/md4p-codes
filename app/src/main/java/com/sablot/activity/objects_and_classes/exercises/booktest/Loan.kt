package com.sablot.activity.objects_and_classes.exercises.booktest


// Define data class for a loan
data class Loan(
    val book: Book,
    val borrower: Borrower,
    val dueDate: String,
    var returnDate: String? = null
)