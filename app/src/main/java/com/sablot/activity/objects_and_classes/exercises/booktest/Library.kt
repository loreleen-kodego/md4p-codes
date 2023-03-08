package com.sablot.activity.objects_and_classes.exercises.booktest


// Define class for a library
class Library {
    val books = mutableListOf<LibraryBook>()
    val loans = mutableListOf<Loan>()

    fun addBook(book: Book) {
        books.add(LibraryBook(book))
    }


    fun removeBook(book: Book) {
        books.removeAll { it.book == book }
    }


    fun displayAllBooks() {
        if (books.isEmpty()) {
            println("No books in the library.")
        } else {
            println("Books in the library:")
            for (libraryBook in books) {
                println("Title : ${libraryBook.book.title} Author : ${libraryBook.book.author} Status : ${libraryBook.book.status}")
            }
        }
    }


    fun createLoan(book: Book, borrower: Borrower, dueDate: String) {
        book.status = BookStatus.ON_LOAN
        loans.add(Loan(book, borrower, dueDate))
    }


    fun displayAllLoans() {
        if (loans.isEmpty()) {
            println("No loans in the library.")
        } else {
            println("Loans in the library:")
            for (loan in loans) {
                println("${loan.book.title} by ${loan.book.author} borrowed by ${loan.borrower.name} (due ${loan.dueDate})")
            }
        }
    }
}
