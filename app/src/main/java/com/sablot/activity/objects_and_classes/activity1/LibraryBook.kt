package com.sablot.activity.objects_and_classes.activity1

data class LibraryBook(val book: Book, var status: BookStatus)

val listOfLibraryBook = mutableListOf<LibraryBook>()
