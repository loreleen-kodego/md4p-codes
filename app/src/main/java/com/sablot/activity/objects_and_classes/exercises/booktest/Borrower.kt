package com.sablot.activity.objects_and_classes.exercises.booktest

// Define data class for a borrower, which implements the Person interface
data class Borrower(
    val libraryCardNumber: Int,
    override val name: String,
    override val phone: String
) : Person