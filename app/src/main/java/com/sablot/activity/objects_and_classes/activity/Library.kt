package com.sablot.activity.objects_and_classes.activity


//Scenario: Suppose we are building a system for managing a library's collection of books.
// We need to store information about books, borrowers, and loans. Each book has a title,
// an author, a publication date, and a status (available or on loan). Each borrower
// has a name, a phone number, and a library card number. Each loan is associated with a
// book and a borrower and has a due date and a return date.

class Library {
    val listOfBooks = mutableListOf<Book>()
    val listOfLoans = mutableListOf<Loan>()

    //Adding of books
    fun addBook(book: Book) {
        listOfBooks.add(book)
    }

    // removing of books
    fun removeBooks(book: Book) {
        listOfBooks.remove(book)
    }

    //display all books
    fun displayAllBooks() {
        listOfBooks.forEach {
            println(it.toString())
        }
    }

    //Display all loans
    fun displayLoans() {
        listOfLoans.forEach {
            println(it.toString())
        }
    }
}