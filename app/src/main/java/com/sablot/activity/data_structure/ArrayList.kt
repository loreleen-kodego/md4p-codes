package com.sablot.activity.data_structure

fun main() {
//    val arrayList = ArrayList<String>()
//
//    arrayList.add("Hello")
//    arrayList.add("Kotlin")
//    arrayList.add("Yoye")
//
////    println(arrayList[0])
////    arrayList.remove("Hello")
//    arrayList[1] = "Java"
//
//    println(arrayList.size.toString())
    groceryStore()
}

fun groceryStore() {
    val groceryList = ArrayList<String>()
    val removeGroceryList = ArrayList<String>()

    while (true) {
        println("Welcome to the grocery store")
        println("Please choose an option:")
        println("1. Add an item and its price")
        println("2. Remove an item")
        println("3. Print the list")
        println("4. Exit")

        when (readln().toIntOrNull()) {
            1 -> {
                println("Enter the name of an item: ")
                val item = readLine() ?: ""
                println("Enter the price of an item")
                val price = readLine()?.toFloatOrNull() ?: 0.00

                groceryList.add("$item - Php${"%.2f".format(price)}")
                println("Item added successfully")
            }
            2 -> {
                println("Grocery List:")
                groceryList.forEachIndexed { index, itemName ->
                    println("${index + 1}.$itemName")
                }

                println("Select an item to remove:")
                val index = readLine()?.toIntOrNull()?.minus(1) ?: -1

                if (index in 0 until groceryList.size) {
                    removeGroceryList.add(groceryList[index])
                    groceryList.removeAt(index)
                    println("Item removed successfully!")
                    groceryList[index]
                    println(removeGroceryList.toString())
                } else {
                    println("Invalid index! Wala siya sa array!")
                }
            }
            3 -> {
                println("Grocery List:")
                groceryList.forEachIndexed { index, itemName ->
                    println("${index + 1}.$itemName")
                }
            }
            4 -> {
                println("Exiting the program")
                return
//                groceryList.clear()
//                println(groceryList.toString())
            }
            else -> {
                println("Invalid option! Please try again")
            }
        }
    }
}