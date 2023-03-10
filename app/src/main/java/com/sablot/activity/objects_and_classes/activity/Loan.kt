package com.sablot.activity.objects_and_classes.activity


data class Loan(
    val book: Book,
    val borrower: Borrower,
    //2023-03-20
    val dueDate: String,
    val returnDate: String
) {
    override fun toString(): String {
        return "Mr/Ms: ${borrower.name} has borrowed ${book.title} with a due date on $dueDate"
    }
}
