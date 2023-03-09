package com.sablot.activity.objects_and_classes.activity

import android.icu.text.CaseMap.Title

class Library(
    private val listOfBooks: ArrayList<LibraryBook>
) {

    //Add book
    fun addBookToTheLibrary(
        title: String,
        author: String,
        publicationDate: String,
        status: BookStatus
    ) {
        val book = Book(title, author, publicationDate, status)
        val bookToAdd = LibraryBook(book, status)
        listOfBooks.add(bookToAdd)
    }

    //Another variation
    fun addBook(book: Book, status: BookStatus) {
        val bookToAdd = LibraryBook(book,status)
        listOfBooks.add(bookToAdd)
    }


    //Methods
    // remove book
    // displaying all books
    // creating loans
    // displaying all loans
}