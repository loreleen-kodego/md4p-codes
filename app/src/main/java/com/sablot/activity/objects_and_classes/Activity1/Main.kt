package com.sablot.activity.objects_and_classes.Activity1

import android.os.Build
import androidx.annotation.RequiresApi
import com.sablot.activity.objects_and_classes.books
import java.time.LocalDate
import java.util.*


@RequiresApi(Build.VERSION_CODES.O)
fun main() {
    var input: String
    var option: MainMenuOption
    val library= Library()


    do {
        println("Please select an option:")
        println("A) Add book")
        println("R) Remove book")
        println("D) Display all books")
        println("L) Create loan")
        println("S) Display all loans")
        println("X) Exit program")
        input = readLine() ?: ""
        option = when (input.toUpperCase(Locale.ROOT)) {
            "A" -> MainMenuOption.ADD_BOOK
            "R" -> MainMenuOption.REMOVE_BOOK
            "D" -> MainMenuOption.DISPLAY_ALL_BOOKS
            "L" -> MainMenuOption.CREATE_LOAN
            "S" -> MainMenuOption.DISPLAY_ALL_LOANS
            "X" -> MainMenuOption.EXIT_PROGRAM
            else -> MainMenuOption.EXIT_PROGRAM
        }

        when (option) {
            MainMenuOption.ADD_BOOK -> addBook(library)
            MainMenuOption.REMOVE_BOOK -> removeBook(library)
            MainMenuOption.DISPLAY_ALL_BOOKS -> displayAllBooks(library)
            MainMenuOption.CREATE_LOAN -> createLoan(library)
            MainMenuOption.DISPLAY_ALL_LOANS -> displayAllLoans(library)
            MainMenuOption.EXIT_PROGRAM -> println("Exiting program...")
        }
    } while (option != MainMenuOption.EXIT_PROGRAM)

}

fun addBook(library:Library) {
    println("Enter the book's information:")
    print("Title: ")
    val title = readLine() ?: ""
    print("Author: ")
    val author = readLine() ?: ""
    print("Publication Date: ")
    val publicationDate = readLine() ?: ""
    val status = BookStatus.AVAILABLE
    val book = Book(title, author, publicationDate, status)
    library.books.add(book)
    println("$book added to the library.")
}


fun removeBook(library: Library) {
    println("Enter the title of the book to remove:")
    val title = readLine() ?: ""
    val book = library.books.find { it.title == title }
    if (book != null) {
        library.books.remove(book)
        println("$book removed from the library.")
    } else {
        println("Book not found.")
    }


}

fun displayAllBooks(library: Library) {
    if (library.books.isEmpty()) {
        println("There are no books in the library's collection.")
    } else {
        library.books.forEach { println(it) }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
fun createLoan(library: Library) {
    println("Enter your name:")
    val name = readLine()?:""
    println("Phone Number:")
    val phone= readLine()?:""

    println("card Number:")
    val cardNumber = readLine()!!.toLong()?:""

    val borrower = Borrower(name,phone, cardNumber as Long)


    println("Book title:")
    val title = readLine()?:""

    val book = library.books.find { it.title == title }
    if (book != null) {
        val borrowDate: LocalDate = LocalDate.now()
        val dueDate: LocalDate = borrowDate.plusDays(7)
        println("$book On Loan by $borrower borrow date :$borrowDate and due-date:$dueDate.")

        library.books.remove(book)
        val loan =Loan(book,borrower,dueDate)
        book.status = BookStatus.ON_LOAN

        library.loans.add(loan)


    } else {
        println("Book not found.")

    }



}


fun displayAllLoans(library: Library) {
    if (library.loans.isEmpty()) {
        println("There are no books in the library's collection.")
    } else {
        library.loans.forEach { println(it) }
    }

}
