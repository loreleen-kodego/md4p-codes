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
    val groceryList = arrayListOf<String>()
    val sampleArray = ArrayList<String>()
    val list = listOf<String>()
    val listMutable = mutableListOf<String>()
    val removeGroceryList = arrayListOf<String>()

    while (true) {
        println("Welcome to the grocery store")
        println("Please choose an option:")
        println("1. Add an item and its price")
        println("2. Remove an item")
        println("3. Print the list")
        println("4. Search for an item in the grocery")
        println("5. Exit")

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
                println("Search the number of the grocery item")
                val itemToBeSearch = readLine() ?: ""
                val searchItem = groceryList.first {
                    it.contains(
                        itemToBeSearch,
                        ignoreCase = true
                    )
                } //Text to be matched
                val element = groceryList.indexOf(searchItem) // Number of the Element
                println("You found ${groceryList[element]}") // Yung mismong element yung ipriprint kung saan nagmatch sa first condition

                groceryList.forEachIndexed { index, itemName ->
                    if (itemName.contains(itemToBeSearch, ignoreCase = true)) {
                            println("You found ${groceryList[index]}")
                        } else println("")
                }
//
//                groceryList.sortBy {
//
//                }
            }
            5 -> {
//                println("Exiting the program")
//                return
//                groceryList.clear()
                println(groceryList.toString())
            }
            else -> {
                println("Invalid option! Please try again")
            }
        }
    }
}