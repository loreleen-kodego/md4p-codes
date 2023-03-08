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
        option = when (input.uppercase(Locale.ROOT)) {
            "A" -> MainMenuOption.ADD_BOOK
            "R" -> MainMenuOption.REMOVE_BOOK
            "D" -> MainMenuOption.DISPLAY_ALL_BOOKS
            "L" -> MainMenuOption.CREATE_LOAN
            "S" -> MainMenuOption.DISPLAY_ALL_LOANS
            "X" -> MainMenuOption.EXIT_PROGRAM
            else -> MainMenuOption.EXIT_PROGRAM
        }

        when (option) {
            MainMenuOption.ADD_BOOK -> library.addBook()
            MainMenuOption.REMOVE_BOOK -> library.removeBook()
            MainMenuOption.DISPLAY_ALL_BOOKS -> library.displayAllBooks()
            MainMenuOption.CREATE_LOAN -> library.createLoan()
            MainMenuOption.DISPLAY_ALL_LOANS -> library.displayAllLoans()
            MainMenuOption.EXIT_PROGRAM -> println("Exiting program...")
        }
    } while (option != MainMenuOption.EXIT_PROGRAM)

}



