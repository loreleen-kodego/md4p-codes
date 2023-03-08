package com.sablot.activity.objects_and_classes.Activity1

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

class Library (
    val books: ArrayList<Book> = ArrayList(),
    val loans: ArrayList<Loan> = ArrayList()){


    fun addBook() {
        println("Enter the book's information:")
        print("Title: ")
        val title = readLine() ?: ""
        print("Author: ")
        val author = readLine() ?: ""
        print("Publication Date: ")
        val publicationDate = readLine() ?: ""
        val status = BookStatus.AVAILABLE
        val book = Book(title, author, publicationDate, status)
        books.add(book)
        println("$book added to the library.")
    }

    fun removeBook() {
        println("Enter the title of the book to remove:")
        val title = readLine() ?: ""
        val book = books.find { it.title == title }
        if (book != null) {
            books.remove(book)
            println("$book removed from the library.")
        } else {
            println("Book not found.")
        }


    }


    fun displayAllBooks() {
        if (books.isEmpty()) {
            println("There are no books in the library's collection.")
        } else {
            books.forEach { println(it) }
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun createLoan() {
        println("Enter your name:")
        val name = readLine()?:""
        println("Phone Number:")
        val phone= readLine()?:""

        println("card Number:")
        val cardNumber = readLine()!!.toLong()?:""

        val borrower = Borrower(name,phone, cardNumber as Long)


        println("Book title:")
        val title = readLine()?:""

        val book =books.find { it.title ==title }
        if (book != null) {
            val borrowDate: LocalDate = LocalDate.now()
            val dueDate: LocalDate = borrowDate.plusDays(7)
            println("$book On Loan by $borrower borrow date :$borrowDate and due-date:$dueDate.")
            books.remove(book)
            val loan =Loan(book,borrower,dueDate)
            book.status = BookStatus.ON_LOAN

            loans.add(loan)


        } else {
            println("Book not found.")

        }



    }


    fun displayAllLoans() {
        if (loans.isEmpty()) {
            println("There are no books in the library's collection.")
        } else {
            loans.forEach { println(it) }
        }

    }

}
