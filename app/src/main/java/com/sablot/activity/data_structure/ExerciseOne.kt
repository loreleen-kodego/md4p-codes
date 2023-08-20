package com.sablot.activity.data_structure

//fun com.sablot.activity.objects_and_classes.exercises.ten.main() {
////    Exercise 1: Create a program that reads in a list of names from the user, and then performs
////    some basic operations on the list, such as sorting the names, finding the longest and
////    shortest name, and printing out the names in reverse order.
//
//    println("Enter a list of names, separated by commas")
//    val input = readLine()
//    val list = mutableListOf<String>()
//    val names = input?.split(",")?.map {
//        it.trim()
//    }
//
//    names?.apply {
//        println(sorted())
//        println(maxByOrNull { it.length })
//        println(minByOrNull { it.length })
//        println(sorted().asReversed())
//    }
//
//
////    val sortedNames = names.sorted()
////
////    val longestName = names.maxByOrNull { it.length }
////    val shortestName = names.minByOrNull { it.length }
////
////    val reverseName = names.asReversed()
//
//
//}


//Exercise 2: Create a program that reads in a list of words from the user, and then
// uses an iterator to iterate over the list and count the number of words that
// contain a particular letter.
fun main() {
    println("Enter a list of words, separated by commas")
    val input = readLine()
    val words = input?.split(" ")?.map { it.trim() }

    // Search of letter
    println("Enter a letter to search for:")
    val letter = readLine()?.trim()?.getOrNull(0)

    if (letter == null) {
        println("Invalid input")
        return
    }

    //Iterator
    var count = 0
    val iterator = words?.iterator()

    while (iterator?.hasNext() == true) {
        val word = iterator.next()

        if (word.contains(letter, ignoreCase = true)){
            count++
        }
    }

    //Print result
    println("The number of words that $letter: $count")



}