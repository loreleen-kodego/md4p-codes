package com.sablot.activity.objects_and_classes.activity


data class Loan(
    val book: Book,
    val dueDate: String,
    val returnDate: String
) {
    private val listOfLoans = mutableListOf<Loan>()
//    val listOfLoans = MutableList<Loan>()
    //Methods
    //Creating of loans
    fun createLoans(book: Book, borrower: Borrower, dueDate: String, returnDate: String) : Loan {
        return Loan(book, dueDate, returnDate)
    }

    //Display all loans
    fun displayLoans() {
        listOfLoans.forEach {
            println(it)
        }
    }

}
