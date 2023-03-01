package com.sablot.activity.data_structure

import com.sablot.activity.objects_and_classes.classes.House

class Beverage(val name: String, val price: Double)

val beverages = listOf(
    Beverage("Coffee", 2.5),
    Beverage("Tea", 2.0),
    Beverage("Latte", 3.5),
    Beverage("Cappuccino", 3.0),
    Beverage("Hot Chocolate", 3.5)
)

class CoffeeShop(val beverages: List<Beverage>) {

    private val calculateRevenue = { beverage: Beverage, unitsSold: Int ->
        beverage.price * unitsSold
    }

    fun totalRevenueByBeverageType(unitsSoldByBeverageType: Map<String, Int>): Map<String, Double> {
        return unitsSoldByBeverageType.mapValues { (beverageType, unitsSold) ->
            val beverage = beverages.first { it.name == beverageType }
            calculateRevenue(beverage, unitsSold)
        }
    }

    fun totalRevenue(unitsSoldByBeverageType: Map<String, Int>): Double {
        val revenueByBeverageType = totalRevenueByBeverageType(unitsSoldByBeverageType)
        return revenueByBeverageType.values.sum()
    }
}

fun main() {
    val myHouse = House()
    val coffeeShop = CoffeeShop(beverages)

    val unitsSoldByBeverageType = mapOf(
        "Coffee" to 50,
        "Tea" to 30,
        "Latte" to 20,
        "Cappuccino" to 40,
        "Hot Chocolate" to 25
    )
    val totalRevenue = coffeeShop.totalRevenue(unitsSoldByBeverageType)
    val revenueByBeverageType = coffeeShop.totalRevenueByBeverageType(unitsSoldByBeverageType)
    println("Total revenue: $totalRevenue")
    revenueByBeverageType.forEach { (beverageType, revenue) ->
        println("$beverageType revenue: $revenue")
    }
}
//Output:
//
//Total revenue: 462.5
//Coffee revenue: 125.0
//Tea revenue: 60.0
//Latte revenue: 70.0
//Cappuccino revenue: 120.0
//Hot Chocolate revenue: 87.5




