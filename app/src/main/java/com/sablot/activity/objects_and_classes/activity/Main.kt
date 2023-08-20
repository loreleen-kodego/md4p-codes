package com.sablot.activity.objects_and_classes.activity

import java.text.SimpleDateFormat
import java.time.LocalDate

val library = Library()

val bookList = listOf(
    Book("Noli Me Tangere", "Jose Rizal","1887"),
    Book("El Filibusterismo", "Jose Rizal","1891"),
    Book("Florante at Laura", "Francisco Balagtas","1838"),
    Book("Mga Ibong Mandaragit", "Amado Hernandez","1969"),
    Book("The Woman Who Had Two Navels", "Nick Joaquin","1961")
)

fun main() {
    displayMenu()
    userInputSelection()
}

fun displayMenu() {
    for (selectionName in MainMenuOption.values()) {
        println(selectionName.selectionName)
        println(" ")
    }
}

fun userInputSelection() {
    val choice = readLine()?.toIntOrNull()
    when (choice) {
        MainMenuOption.ADDING_BOOK.number -> addBook()
        MainMenuOption.REMOVING_BOOK.number -> removeBook()
        MainMenuOption.DISPLAY_BOOK.number -> displayBook()
        MainMenuOption.CREATE_LOAN.number -> createLoan()
        MainMenuOption.DISPLAY_LOAN.number -> displayLoans()
        else -> println("Invalid keyword")
    }
}

fun createLoan() {
    while (true) {
        println("What is your full name?")
        val name = readLine().toString()

        println("What is your phone number?")
        val phoneNumber = readLine().toString()
        //+639478164325

        println("What is your library card?")
        val libraryCard = readLine().toString()
        //1234-1234

        println("What is the title of the book?")
        val title = readLine().toString()

        val borrower = Borrower(libraryCard, name,phoneNumber)

        //Change the status of the book to ON_LOAN
        searchBookName(title)?.status = BookStatus.ON_LOAN

        val loan = searchBookName(title)?.let {
            dateFormatter(dueDateOfBook())?.let { it1 ->
                dateFormatter(dueDateOfBook())?.let { it2 ->
                    Loan(
                        it, borrower,
                        it1, it2
                    )
                }
            }
        }

        println("Your due date of the book is on ${dateFormatter(dueDateOfBook())}")
        loan?.let { library.listOfLoans.add(it) }
        println("Loan is added successfully")
        return main()
    }
}

fun displayLoans() {
    library.displayLoans()
    return main()
}

fun dateFormatter(date: String): String? {
    //Input 2023-03-20
    //Output March 20, 2023
    val inputFormat = SimpleDateFormat("yyyy-MM-dd")
    val outputFormat =  SimpleDateFormat("MMMM dd, yyyy")
    return inputFormat.parse(date)?.let { outputFormat.format(it) }
}

fun dueDateOfBook(): String {
    val currentDate = LocalDate.now()
    return currentDate.plusDays(10).toString()
}


fun addBook() {
    while (true) {
        println("What is the title of the book?")
        val title = readLine().toString()

        println("Who is the author of the book?")
        val author = readLine().toString()

        println("What is the publication of the book?")
        val publicationDate = readLine().toString()

        val book = Book(title, author, publicationDate)

        library.addBook(book)
        println("Book is added successfully")
        return main()
    }

    //For adding books directly
//    library.listOfBooks.addAll(bookList)
//    return main()
}

fun displayBook() {
    library.displayAllBooks()
    return main()
}

fun searchBookName(query: String) : Book? {
    return library.listOfBooks.find {
        it.title.contains(query, ignoreCase = true)
    }
}


fun removeBook() {
    while (true) {
        println("What is the title of the book do you want to remove?")
        val remove = readLine().toString()
        val searchResult = searchBookName(remove)

        return if (searchResult != null) {
            library.removeBooks(searchResult)
            println("The book has successfully removed")
            main()
        } else {
            println("The book has not found or not existing.")
            main()
        }
    }
}






