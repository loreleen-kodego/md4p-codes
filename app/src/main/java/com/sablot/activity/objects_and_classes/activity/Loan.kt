package com.sablot.activity.objects_and_classes.activity

data class Loan(
    val book: Book,
    val borrower: Borrower,
    val dueDate: String,
    val returnDate: String
)
