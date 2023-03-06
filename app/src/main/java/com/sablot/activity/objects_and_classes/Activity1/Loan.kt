package com.sablot.activity.objects_and_classes.Activity1

import java.time.LocalDate

data class Loan(
    val book: Book,
    val borrower: Borrower,
    val dueDate: LocalDate,
    var returnDate: LocalDate? = null
){

}
