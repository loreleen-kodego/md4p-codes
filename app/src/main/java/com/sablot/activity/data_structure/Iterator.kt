package com.sablot.activity.data_structure

fun main() {

//Using an Iterator to iterate over a List:
    val list = listOf("apple", "banana", "orange")
    val iterator = list.iterator()

    while (iterator.hasNext()) {
        val fruit = iterator.next()
        println(fruit)
    }

    //Using a ListIterator to iterate over a MutableList, and remove elements:
//    val mutableList = mutableListOf("apple", "banana", "orange", "yoye")
//    val listIterator = mutableList.listIterator()
//
//    while (listIterator.hasPrevious()) {
//        val fruit = listIterator.previous()
//        if (fruit == "banana") {
//            listIterator.remove()
//        }
//    }
//    println(mutableList)


//    Using a for loop with an iterator:
//    val set = setOf("apple", "banana", "orange")
//
//    for (fruit in set.iterator()) {
//        println(fruit)
//    }

    //Using a sequence to create an iterator and apply transformations:
//    val list = listOf(1, 2, 3, 4, 5)
//
//    val sequence = list.asSequence()
//        .filter { it % 2 == 0 }
//        .map { it * 2 }
//
//    for (number in sequence) {
//        println(number)
//    }
}