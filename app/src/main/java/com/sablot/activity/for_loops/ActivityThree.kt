package com.sablot.activity.for_loops

import java.util.*


//    for (item in 1..10) {
//        println("Number $item")
//    }

//    val names = listOf("Paul", "Ronnel", "Karl", "Rene", "Emilio", "Kyle", "Mario", "Rodney")
//    for (name in names) {
//        println("$name is Learning in Mobile Development")
//    }

//    for (item in 1..10) {
//        if (item % 2 == 0 ) {
//            println("The number $item is even")
//        } else println("The number $item is odd")
//    }

//    var item = 2
//    while (item >= -5) {
//        println(item)
//        item--
//    }

//    var continueGrading = true
//    while (continueGrading) {
//        println("Enter your score:")
//        val score = readLine()!!.toInt()
//        println("Grade: ${calculateGrade(score)}")
//        println("Do you want to continue grading. Type yes or no")
//        val response = readLine()
//        if (response != "yes")
//            continueGrading = false
//    }

fun main() {
//    orderFood()
//    var count = 0
//    do {
//        println("Count is $count")
//        count++
//    } while (count <= 5)

//    for (i in 1..10) {
//        println(i)
//    }
//
//    for (item in 10 downTo 1) {
//        println(item)
//    }
//
//    for (i in 1 until 10) {
//        println(i)
//    }
//
//    val numbers = 1..10
//    for (i in numbers) {
//        println(i)
//    }

}

fun orderFood() {
    var orderMore = true

    do {
        println("What would you order? 1. Pizza, 2. Burger, 3. Pasta, 4. Done ordering")
        val choice = readLine()!!.toInt()
        when (choice) {
            1 -> println("You have order a pizza")
            2 -> println("You have order a burger")
            3 -> println("You have order a pasta")
            4 -> {
                println("De wag")
                orderMore = false
            }
        }
    } while (orderMore)
}

fun calculateGrade(score: Int) : String {
    return when {
        score >= 90 -> "A"
        score >= 80 -> "B"
        score >= 70 -> "A"
        score >= 60 -> "B"
        else -> "F"
    }
}
