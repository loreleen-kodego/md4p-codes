package com.sablot.activity.objects_and_classes.Activity1

data class Loan(
    val book: Book,
    val borrower: Borrower,
    val dueDate: String,
    var returnDate: String? = null
)
