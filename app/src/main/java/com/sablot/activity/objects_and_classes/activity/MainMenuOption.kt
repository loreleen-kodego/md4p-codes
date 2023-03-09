package com.sablot.activity.objects_and_classes.activity

enum class MainMenuOption(val selectionName: String,
                          val number: Int) {
    ADDING_BOOK("Type 1 for Adding a book", 1),
    REMOVING_BOOK("Type 2 for Remove a book", 2),
    DISPLAY_BOOK("Type 3 for Display all books", 3),
    CREATE_LOAN("Type 4 for Create a loan", 4),
    DISPLAY_LOAN("Type 5 for Display all loans", 5),
    EXIT("Type 6 for Exit", 6)
}