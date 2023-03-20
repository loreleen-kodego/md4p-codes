package com.sablot.activity.objects_and_classes.activity1

data class Loan(val book: Book,
                val borrower: Borrower,
                val dueDate: Int,
                val returnDate: Int) {

    fun getLoanDetails(): String {
        return "Book: ${book.title}, Borrower: ${borrower.name}, Due date: $dueDate, Return date: $returnDate"
    }
}