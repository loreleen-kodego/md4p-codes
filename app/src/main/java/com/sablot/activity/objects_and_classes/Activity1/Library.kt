package com.sablot.activity.objects_and_classes.Activity1

import kotlin.String.Companion

class Library (private val books: MutableList<LibraryBook> = mutableListOf()) {

        fun addBook(book: LibraryBook) {
            books.add(book)
        }

        fun removeBook(book: Book) {
            with(books) { -> remove<Any>(book) }
        }

        fun displayAllBooks() {
            books.forEach { println("${it.book.title} by ${it.book.author}, published on ${it.book.publicationDate}, status: ${it.status}") }
        }

        fun createLoan(book: Book, borrower: String, dueDate: String): Loan {
            if (book.status != BookStatus.AVAILABLE
            ) {
                throw Exception("Book is not available for loan")
            }

            book.status = BookStatus.ON_LOAN
            val loan = Loan(
                book,
                borrower,
                dueDate)
            return loan
        }

    private fun Loan(book: Book, borrower: String, dueDate: String): Loan {
        TODO("Not yet implemented")
    }

    @Suppress("NAME_SHADOWING")
    private fun Loan(book: LibraryBook, borrower: Borrower, dueDate: String): Loan {
            var book = LibraryBook()

            var dueDate = Companion
    }

    fun displayAllLoans() {
            books.filter { it.status == BookStatus.ON_LOAN }
                .forEach { println("${it.book.title} by ${it.book.author}, borrowed by ${it.book.borrower}, due on ${it.book.dueDate}") }
        }
    }

private fun <book> MutableList<LibraryBook>.add(element: Book) {

}
