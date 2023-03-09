package com.sablot.activity.objects_and_classes.activity

enum class BookStatus {
    AVAILABLE,
    ON_LOAN
}

enum class MainMenuOption(val selectionNumber: Int) {
    ADDING_BOOK (1),
    REMOVING_BOOK(2),
    DISPLAY_ALL_BOOK(3),
    CREATE_LOANS(4),
    EXIT(5)
}

fun main() {
    val choices = readLine()?.toIntOrNull()

    when (choices) {
        MainMenuOption.ADDING_BOOK.selectionNumber -> TODO()
        MainMenuOption.REMOVING_BOOK.selectionNumber -> TODO()
        MainMenuOption.DISPLAY_ALL_BOOK.selectionNumber -> TODO()
        MainMenuOption.CREATE_LOANS.selectionNumber -> TODO()
        MainMenuOption.EXIT.selectionNumber -> TODO()
    }
}
