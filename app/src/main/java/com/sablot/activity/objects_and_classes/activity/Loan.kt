package com.sablot.activity.objects_and_classes.activity


data class Loan(
    val book: Book,
    val borrower: Borrower,
    val dueDate: String,
    val returnDate: String
) {
    val listOfLoans = mutableListOf<Loan>()

    //Methods
    //Creating of loans
    fun createLoans(book: Book, borrower: Borrower, dueDate: String, returnDate: String) : Loan {
        return Loan(book, borrower, dueDate, returnDate)
    }

    //Display all loans
    fun displayLoans() {
        listOfLoans.forEach {
            println(it)
        }
    }

}
