package com.sablot.activity.objects_and_classes.Activity1

import android.app.ApplicationExitInfo


//class LibraryLoan (val loans: List<Loan>) {

//    enum class MainMenuOption() {
//        ADD_BOOK,
//        REMOVE_BOOK,
//        DISPLAY_ALL_BOOKS,
//        CREATE_LOAN,
//        DISPLAY_ALL_LOANS,
//        EXIT
//    }
//}

fun displayMainMenu() {
    println("Main menu:")
    println("1. Add a book")
    println("2. Remove a book")
    println("3. Display all books")
    println("4. Create a loan")
    println("5. Display all loans")
    println("6. Exit")
}

fun readMainMenuChoice(): MainMenuOption {
    var choice: MainMenuOption? = null
    while (choice == null) {
        print("Enter your choice: ")
        choice = when (readLine()?.toIntOrNull()) {
            1 -> MainMenuOption.ADD_BOOK
            2 -> MainMenuOption.REMOVE_BOOK
            3 -> MainMenuOption.DISPLAY_ALL_BOOKS
            4 -> MainMenuOption.CREATE_LOAN
            5 -> MainMenuOption.DISPLAY_ALL_LOANS
            6 -> MainMenuOption.EXIT
                 else



        }
    }
}

fun main() {

    var input: String
    var option: MainMenuOption
    val library = Library()

    val choice = readLine()?.toIntOrNull()
    when {
        choice == 1 -> {
            print("Enter book title: ")
            val title = readLine() ?: ""
            print("Enter book author: ")
            val author = readLine() ?: ""
            print("Enter book ISBN: ")
            val isbn = readLine() ?: ""
            library.addBook(Book(title, author, isbn))
            println("Book added successfully.")
        }
        choice == 2 -> {
            print("Enter book title: ")
            val title = readLine() ?: ""
            print("Enter book author: ")
            val author = readLine() ?: ""
            print("Enter book ISBN: ")
            val isbn = readLine() ?: ""
            library.removeBook(Book(title, author, isbn))
            println("Book removed successfully.")
        }
        choice == 3 -> library.displayAllBooks()
        choice == 4 -> {
            print("Enter book title: ")
            val title = readLine() ?: ""
            print("Enter book author: ")
            val author = readLine() ?: ""
            print("Enter book ISBN: ")
            val isbn = readLine() ?: ""
            val book = Book(title, author, isbn)
            print("Enter borrower name: ")
            val borrower = readLine() ?: ""
            print("Enter due date (yyyy-mm-dd): ")
            val dueDate = readLine() ?: ""
            library.createLoan(book, borrower, dueDate)
            println("Loan created successfully.")
        }
        choice == 5 -> library.displayAllLoans()
        choice == 6 -> println("Exit")
        else -> println("Invalid choice. Please try again.")

    }


    println("Thank you for using the Library Management System.")
    return

}