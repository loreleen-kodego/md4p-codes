package com.sablot.activity.data_structure

fun main() {
    val map = mapOf("Alice" to 25, "Bob" to 32, "Charlie" to 19)

    println(map["Alice"]) // Output: 25

    for ((name, age) in map) {
        println("$name is $age years old")
    }

    //You can modify
    //var
    //arraylist
    //hashMap

    //Read only
    //val
    //list
    //map
}