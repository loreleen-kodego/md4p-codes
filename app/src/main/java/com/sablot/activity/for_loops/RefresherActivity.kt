package com.sablot.activity.for_loops

import com.sablot.activity.objects_and_classes.classes.House

var totalSales: Double = 0.0
var totalOrders: Int = 0

fun main() {
    var isDone = false
    while (!isDone) {
        print("Enter the cost of the next coffee order (or type 'done' to exit): ")
        val input = readLine()

        if (input == "done") {
            generateReport()
        } else {
            val cost = input?.toDoubleOrNull()
            if (cost != null) {
                takeOrder(cost)
            } else {
                println("Invalid input. Please enter a number.")
            }
        }
    }
}


fun takeOrder(cost: Double) {
    totalSales += cost // totalSales = totalSales + cost
    totalOrders++
    println("Order received. Your total is P$cost.")
}

fun generateReport() {
    println("\n")
    println("==========SALES REPORT==========")
    println("Total orders: $totalOrders")
    println("Total sales: P$totalSales")
    println(
        "Average sale per order: P${
            if (totalOrders > 0) {
                totalSales / totalOrders
            } else {
                0.0
            }
        }"
    )
    println("==========SALES REPORT==========")
}