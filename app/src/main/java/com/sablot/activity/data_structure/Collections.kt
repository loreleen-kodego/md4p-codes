package com.sablot.activity.data_structure

fun main() {
//    //Creating a immutable list
//    val list = listOf("apple", "banana", "orange", "banana")
//
//    //Creating a mutable list
//    val mutableList = mutableListOf("apple", "banana", "orange")
//    val mutableListTwo = mutableListOf("yoye", "loreleen", "mae")
//
//    //Adding an element in a mutable list
//    mutableList.add("grape")
//
//    //Removing an element in a mutable list in a specific index
//
//    mutableList.apply {
//        addAll(mutableListTwo)
//        removeAt(1)
//        println(dropLast(2))
//        get(2)
//    }
//
//    //Creating a map
//    val set = setOf("apple", "banana", "orange")
//    val map = mapOf(
//        "apple" to 1,
//        "banana" to 2,
//        "orange" to 3
//    )
//
//    //Accessing the map key, values
//    val value = map["apple"]
//
//    //Iterating over collection
//    val listOne = listOf("apple", "banana", "orange")
//    for (fruit in list) {
//        println(fruit)
//    }

    //Functional programming
    val listThree = listOf(1, 2, 3, 4, 5)
    val filteredList = listThree.filter {
       it % 2 == 0
    }
//    val sorted = listThree.sortedWith { a, b ->
//        when {
//            a > b -> 1
//            a < b -> -1
//            else -> 0
//        }
//    }
//    println(sorted)
// Use case
//    println(listThree.spliterator())

    val doubledList = listThree.map { it * 2 }
//    val sum = list.reduce { acc, element -> acc + element }


}

