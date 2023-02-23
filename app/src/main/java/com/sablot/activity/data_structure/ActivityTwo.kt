package com.sablot.activity.data_structure

val beverages = listOf(
    Pair("Coffee", 2.5),
    Pair("Tea", 2.0),
    Pair("Latte", 3.5),
    Pair("Cappuccino", 3.0),
    Pair("Hot Chocolate", 3.5)
)

val calculateRevenue = { beverage: Pair<String, Double>, unitsSold: Int ->
    beverage.second * unitsSold
}

fun totalRevenueByBeverageType(beverages: List<Pair<String, Double>>, unitsSoldByBeverageType: Map<String, Int>): Map<String, Double> {
    return unitsSoldByBeverageType.mapValues { (beverageType, unitsSold) ->
        val beverage = beverages.first { it.first == beverageType }
        calculateRevenue(beverage, unitsSold)
    }
}

fun totalRevenue(beverages: List<Pair<String, Double>>, unitsSoldByBeverageType: Map<String, Int>): Double {
    val revenueByBeverageType = totalRevenueByBeverageType(beverages, unitsSoldByBeverageType)
    return revenueByBeverageType.values.sum()
}

fun main() {
    val unitsSoldByBeverageType = mapOf(
        "Coffee" to 50,
        "Tea" to 30,
        "Latte" to 20,
        "Cappuccino" to 40,
        "Hot Chocolate" to 25
    )
    val totalRevenue = totalRevenue(beverages, unitsSoldByBeverageType)
    val revenueByBeverageType = totalRevenueByBeverageType(beverages, unitsSoldByBeverageType)
    println("Total revenue: $totalRevenue")
    revenueByBeverageType.forEach { (beverageType, revenue) ->
        println("$beverageType revenue: $revenue")
    }
}
