package com.sablot.activity.objects_and_classes.Activity1

data class Loan(
    val book: String,
    val borrower: String,
    val dueDate: String,
    var returnDate: String? = null
)
