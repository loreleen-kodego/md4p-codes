package com.sablot.activity.objects_and_classes.Activity1

}class LibraryLoan (val loans: List<Loan>) {

//    enum class MainMenuOption {
//        ADD_BOOK,
//        REMOVE_BOOK,
//        DISPLAY_ALL_BOOKS,
//        CREATE_LOAN,
//        DISPLAY_ALL_LOANS,
//        EXIT
//    }
}

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


        }
    }
}

fun main() {

    var input: String
    var option: MainMenuOption
    var library = Library()

    displayMainMenu()
    readMainMenuChoice()
}