package com.sablot.activity.objects_and_classes.Activity1

class Library (private val books: MutableList<LibraryBook> = mutableListOf()) {

        fun addBook(book: LibraryBook) {
            books.add(book)
        }

        fun removeBook(book: LibraryBook) {
            books.remove(book)
        }

        fun displayAllBooks() {
            books.forEach { println("${it.book.title} by ${it.book.author}, published on ${it.book.publicationDate}, status: ${it.status}") }
        }

        fun createLoan(book: LibraryBook, borrower: Borrower, dueDate: String): Loan {
            if (book.status != BookStatus.AVAILABLE) {
                throw Exception("Book is not available for loan")
            }

            book.status = BookStatus.ON_LOAN
            val loan = Loan(
                book,
                borrower,
                dueDate)
            return loan
        }

        fun displayAllLoans() {
            books.filter { it.status == BookStatus.ON_LOAN }
                .forEach { println("${it.book.title} by ${it.book.author}, borrowed by ${it.book.borrower.name}, due on ${it.book.dueDate}") }
        }
    }
}