package com.sablot.activity.objects_and_classes.activity

data class Borrower(
    val libraryCardNumber: String,
    override val name: String,
    override val phoneNumber: String
) : Person
