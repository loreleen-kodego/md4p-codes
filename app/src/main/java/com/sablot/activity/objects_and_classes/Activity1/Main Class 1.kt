package com.sablot.activity.objects_and_classes.Activity1

import java.util.Date

interface Person {
    val name: String
    val phone: String
}

data class Borrower(
    val libraryCardNumber: String,
    override val name: String,
    override val phone: String
) : Person

enum class BookStatus {
    AVAILABLE,
    ON_LOAN
}

class Book(
    val title: String,
    val author: String,
    val publicationDate: Date,
    var status: BookStatus
)

data class LibraryBook(
    val book: Book,
    var status: BookStatus
)

class Library {
    val books = mutableListOf<LibraryBook>()
    val loans = mutableListOf<Loan>()

    fun addBook(title: String, author: String, publicationDate: Date) {
        val book = Book(title, author, publicationDate, BookStatus.AVAILABLE)
        books.add(LibraryBook(book, BookStatus.AVAILABLE))
    }

    fun removeBook(book: LibraryBook) {
        books.remove(book)
    }

    fun displayBooks() {
        books.forEach { println("${it.book.title} by ${it.book.author} (${it.book.publicationDate}), status: ${it.status}") }
    }

    fun createLoan(book: LibraryBook, borrower: Borrower, dueDate: Date) {
        book.status = BookStatus.ON_LOAN
        loans.add(Loan(book.book, borrower, dueDate))
    }

    fun displayLoans() {
        loans.forEach { println("${it.book.title} borrowed by ${it.borrower.name} (due ${it.dueDate})") }
    }
}

data class Loan(
    val book: Book,
    val borrower: Borrower,
    val dueDate: Date,
    var returnDate: Date? = null
)

class LibraryLoan {
    val loans = mutableListOf<Loan>()

    fun addLoan(loan: Loan) {
        loans.add(loan)
    }
}

enum class MainMenuOption {
    ADD_BOOK,
    REMOVE_BOOK,
    DISPLAY_ALL_BOOKS,
    CREATE_LOAN,
    DISPLAY_ALL_LOANS,
    EXIT
}
fun displayMainMenu() {

    println("Main Menu")
    println("1. Add a book")
    println("2. Remove a book")
    println("3. Display all books")
    println("4. Create a loan")
    println("5. Display all loans")
    println("6. Exit")
}
fun readMainMenuChoice(): MainMenuOption {
    print("Enter your choice: ")
    return when (readLine()) {
        "1" -> MainMenuOption.ADD_BOOK
        "2" -> MainMenuOption.REMOVE_BOOK
        "3" -> MainMenuOption.DISPLAY_ALL_BOOKS
        "4" -> MainMenuOption.CREATE_LOAN
        "5" -> MainMenuOption.DISPLAY_ALL_LOANS
        else -> MainMenuOption.EXIT
    }
}

fun readBookInfoFromUser(): Triple<String, String, Date> {
    print("Enter the book's title: ")
    val title = readLine()!!
    print("Enter the author's name: ")
    val author = readLine()!!
    print("Enter the publication date (YYYY-MM-DD): ")
    val publicationDate = Date()
    return Triple(title, author, publicationDate)
}

fun readBorrowerInfoFromUser(): Triple<String, String, String> {
    print("Enter the borrower's name: ")
    val name = readLine()!!
    print("Enter the borrower's phone number: ")
    val phone = readLine()!!
    print("Enter the borrower's library card number: ")
    val libraryCardNumber = readLine()!!
    return Triple(libraryCardNumber, name, phone)

}
fun main(){
    displayMainMenu()
    readMainMenuChoice()
    readBookInfoFromUser()
    readBorrowerInfoFromUser()
}