//package com.sablot.activity.objects_and_classes.exercises.three
//
//data class Customer(
//    val id: Int,
//    val name: String,
//    val emailAddress: String,
//    val purchases: List<Purchase>
//)
//
//data class Purchase(val nameOfPurchase: String, val price: Double)
//
//fun main() {
//    val customers = listOf(
//        Customer(1, "Alice Smith", "alice@example.com", listOf(Purchase("Shirt", 20.0))),
//        Customer(2, "Bob Johnson", "bob@example.com", listOf(Purchase("Sweater", 40.0),
//            Purchase("Jeans", 30.0))),
//        Customer(3, "Charlie Lee", "charlie@example.com", listOf(Purchase("Sweater", 10.0))
//    ))
//
//    val bigNumberOfGrocery = customers.sortedByDescending {
//        it.purchases.size
//    }
//
//    bigNumberOfGrocery.forEach {
//        println("${it.name} have/has purchased ${it.purchases.sumOf {
//            it.price
//        }}")
//    }
//}