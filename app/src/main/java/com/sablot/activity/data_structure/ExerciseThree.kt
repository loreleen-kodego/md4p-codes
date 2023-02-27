package com.sablot.activity.data_structure

class Product(val name: String, val category: String, val price: Double) {
    override fun toString(): String {
        return "$name ($category) - P$price"
    }
}

val products = listOf(
    Product("Iphone 14 Pro Max", "Electronics", 80000.0),
    Product("Iphone 13 Pro Max", "Electronics", 70000.0),
    Product("Iphone 12 Pro Max", "Electronics", 60000.0),
    Product("Iphone 11 Pro Max", "Electronics", 50000.0),
    Product("Macbook Pro", "Electronics", 80000.0),
    Product("Nike Air Zoom Pegasus 38", "Shoes", 10000.0),
    Product("RL Jacket", "Clothing", 5000.0)
)

fun search(products: List<Product>, query: String): List<Product> {
    //List of keywords under the query variable
    val keywords = query.split(" ").map { it.trim() }

    //Products Filter
    return products.filter { product ->

        // Condition
        keywords.all { it ->
            //Product filtering
            product.name.contains(it, ignoreCase = true) ||
                    //Category Filtering
                    product.category.contains(it, ignoreCase = true) ||
                    //Price Range Filtering
                    it.startsWith("P") && it.substring(1).toDouble().let {
                product.price >= it
            }
        }
    }
}

//Create a enum class that needed in the function sort
enum class SortKey{
    NAME,
    CATEGORY,
    PRICE
}

fun sort(products: List<Product>, key: SortKey): List<Product> {
    return when (key) {
        SortKey.NAME -> products.sortedBy { it.name }
        SortKey.CATEGORY -> products.sortedBy { it.category }
        SortKey.PRICE -> products.sortedBy { it.price }
    }
}

fun main() {

//Variables
//ProductName, ProductCategory,
// ProductPrice, PriceRange

//Filter the product
//Search Queries
//Sort Products
//Storing products in Database [Arraylist]

    println("Welcome to our online store")

    while (true) {
        println("What do you like to do?")
        println("1. Search for products")
        println("2. Sort the products")
        println("3. Sort products by category")
        println("4. Sort products by price")
        println("5. Exit")

        //Default value is 5
        when (readLine()?.toIntOrNull() ?: 5) {
            1 -> choiceSearch()
            2 -> sortSearch()
            3 -> {
                sort(products, SortKey.CATEGORY).forEach {
                    println(it.toString())
                }
            }
            4 -> {
                sort(products, SortKey.PRICE).forEach {
                    println(it.toString())
                }
            }
            5 -> {
                println("Thank you for shopping with us!")
                return
            }
        }
     }
}

// Create functions for selections

fun choiceSearch() {
    println("Enter your search query:")
    val query = readLine()?.trim() ?: ""

    val searchResults = search(products, query)

    if (searchResults.isNotEmpty()) {
        println("Search results:")

        // is to print the filtered result
        searchResults.forEach {
            println(it.toString())
        }
    } else println("No results found")
}

fun sortSearch() {

    //These are list from sort function
    val sortedProductsByName = sort(products, SortKey.NAME)
    val sortedProductsByCategory = sort(products, SortKey.CATEGORY)
    val sortedProductsByPrice = sort(products, SortKey.PRICE)

    println("\n")
    println("Sorted by Name")
    sortedProductsByName.forEach {
        println(it.toString())
    }

    println("\n")
    println("Sorted by Category")
    sortedProductsByCategory.forEach {
        println(it.toString())
    }

    println("\n")
    println("Sorted by Price")
    sortedProductsByPrice.forEach {
        println(it.toString())
    }


}