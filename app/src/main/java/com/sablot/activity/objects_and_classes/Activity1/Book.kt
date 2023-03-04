package com.sablot.activity.objects_and_classes.Activity1

data class Book(
    val title: String,
    val author: String,
    val publicationDate: String,
    var status: BookStatus
)
