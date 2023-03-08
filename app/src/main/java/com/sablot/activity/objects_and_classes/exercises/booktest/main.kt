package com.sablot.activity.objects_and_classes.exercises.booktest

enum class MainMenuOption {
    ADD_BOOK, REMOVE_BOOK, DISPLAY_ALL_BOOKS, CREATE_LOAN, DISPLAY_ALL_LOANS, EXIT
}

fun displayMainMenu() {
    println("Main Menu:")
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
        print("Enter your choice (1-6): ")
        try {
            val input = readLine()?.toInt()
            choice = MainMenuOption.values().find { it.ordinal + 1 == input }
            //println(choice)
        } catch (e: NumberFormatException) {
// Ignore and continue loop
            println("Invalid choice. Please enter a number between 1 and 6.")
        }
    }
    return choice
}



fun readBookInfo(): Book {
    print("Enter the book title: ")
    val title = readLine()!!
    print("Enter the book author: ")
    val author = readLine()!!
    print("Enter the publication date (yyyy-mm-dd): ")
    val publicationDate = readLine()!!
    return Book(title, author, publicationDate)
}


fun readBorrowerInfo(): Borrower {
    print("Enter the borrower's name: ")
    val name = readLine()!!
    print("Enter the borrower's phone number: ")
    val phone = readLine()!!
    print("Enter the borrower's library card number: ")
    val libraryCardNumber = readLine()?.toInt() ?: 0
    return Borrower(libraryCardNumber, name, phone)
}



fun main() {
    val library = Library()
    var exit = false
    while (!exit) {
        displayMainMenu()
        when (readMainMenuChoice()) {
            MainMenuOption.ADD_BOOK -> {
                val book = readBookInfo()
                library.addBook(book)
                println("${book.title} by ${book.author} added to the library.")
            }
            MainMenuOption.REMOVE_BOOK -> {
                library.displayAllBooks()
                print("Enter the title of the book to remove: ")
                val title = readLine()!!
                val booksToRemove = library.books.filter { it.book.title == title }
                if (booksToRemove.isEmpty()) {
                    println("Book not found.")
                } else if (booksToRemove.size == 1) {
                    library.removeBook(booksToRemove.first().book)
                    println("$title removed from the library.")
                } else {
                    println("Multiple books found. Please enter the author to remove:")
                    val author = readLine()!!
                    val bookToRemove = booksToRemove.find { it.book.author == author }
                    if (bookToRemove == null) {
                        println("Book not found.")
                    } else {
                        library.removeBook(bookToRemove.book)
                        println("$title by $author removed from the library.")
                    }
                }
            }
            MainMenuOption.DISPLAY_ALL_BOOKS -> {
                library.displayAllBooks()
            }
            MainMenuOption.CREATE_LOAN -> {
                library.displayAllBooks()
                print("Enter the title of the book to loan: ")
                val title = readLine()!!
                val booksToLoan = library.books.filter { it.book.title == title && it.status == BookStatus.AVAILABLE }
                val checkStatus = booksToLoan.first().book.status.toString()

                if (booksToLoan.isEmpty() || checkStatus == "ON_LOAN" ) {
                    println("Book not found or already on loan.")
                } else if (booksToLoan.size == 1  ) {
                    val borrower = readBorrowerInfo()
                    print("Enter the due date (yyyy-mm-dd): ")
                    val dueDate = readLine()!!
                    library.createLoan(booksToLoan.first().book, borrower,dueDate)
                    println("${booksToLoan.first().book.title} borrowed by ${borrower.name}.")
                } else {
                    println("Multiple books found. Please enter the author to loan:")
                    val author = readLine()!!
                    val bookToLoan = booksToLoan.find { it.book.author == author }
                    if (bookToLoan == null) {
                        println("Book not found or already on loan.")
                    } else {
                        val borrower = readBorrowerInfo()
                        print("Enter the due date (yyyy-mm-dd): ")
                        val dueDate = readLine()!!
                        library.createLoan(booksToLoan.first().book, borrower,dueDate)
                        println("${booksToLoan.first().book.title} borrowed by ${borrower.name}.")

                    }
                }
            }
            MainMenuOption.DISPLAY_ALL_LOANS -> {
                library.displayAllLoans()
            }
            MainMenuOption.EXIT -> {
                exit = true
            }
        }
    }
}
