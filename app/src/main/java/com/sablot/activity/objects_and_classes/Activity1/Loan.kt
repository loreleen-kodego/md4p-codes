package com.sablot.activity.objects_and_classes.Activity1

import android.os.Build
import androidx.annotation.RequiresApi
import com.sablot.activity.objects_and_classes.books
import java.time.LocalDate

data class Loan(
    val book: Book,
    val borrower: Borrower,
    val dueDate: LocalDate,
    var returnDate: LocalDate? = null
){

}
