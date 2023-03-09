package com.sablot.activity.objects_and_classes.Activity1

data class Borrower(
    val libraryCardNumber: String,
    override val name: String,
    override val phone: String
) : Person //inheritance of Borrower
