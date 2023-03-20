package com.sablot.activity.objects_and_classes.activity

val library = Library()


fun main() {

//    library.listOfBooks.addAll(bookList)
//    displayMenu()
//    userInputSelection()
    print("Type 'Menu' for Book Library")
    println()
    var number = Int
    val selectionName = readLine()!!.toString()
    when (selectionName) {
        "Menu" -> {
            library.listOfBooks.addAll(bookList)
            displayMenu(selectionName)
            userInputSelection()
        }
//        else -> println("Invalid input")
    }
    return main()



}

fun displayMenu(selectionName: String) {
    for (selectionName in MainMenuOption.values()) {
        println(selectionName.selectionName)
    }
}

fun userInputSelection() {
    val choice = readLine()?.toIntOrNull()


    when (choice) {
        MainMenuOption.ADDING_BOOK.number -> addBook()
        MainMenuOption.REMOVING_BOOK.number -> removeBook()
        MainMenuOption.DISPLAY_BOOK.number -> displayBook()
        MainMenuOption.CREATE_LOAN.number -> createLoans()
        MainMenuOption.DISPLAY_LOAN.number -> displayLoans()

        else -> println("Invalid keyword")
    }
}

fun displayLoans() {

}

fun createLoans() {

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
}

fun displayBook() {
    library.displayAllBooks()
//    return main()
}

fun removeBook() {
    while (true) {
        println("What is the title of the book do you want to remove?")
        val remove = readLine().toString()
        val searchResult = searchBookNameThatEquals(library.listOfBooks, remove)
//        library.removeBooks(searchResult)
        return main()
    }
}

fun searchBookNameThatEquals(listOfBook: List<Book>, query: String): List<Book> {
    val keywords = query.split(" ").map { it.trim() }
    return listOfBook.filter { book ->
        keywords.all { it ->
            book.title.contains(it, ignoreCase = true)
        }
    }
}




