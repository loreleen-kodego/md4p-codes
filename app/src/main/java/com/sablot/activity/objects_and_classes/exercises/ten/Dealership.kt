//package com.sablot.activity.objects_and_classes.exercises.ten
//
//abstract class Car(val make: String, val model: String, val year: Int, val price: Double) {
//    abstract fun calculateValue(): Double
//}
//
//class Sedan(make: String, model: String, year: Int, price: Double) : Car(make, model, year, price) {
//    override fun calculateValue(): Double {
//        return price * 0.8
//    }
//}
//
//class SUV(make: String, model: String, year: Int, price: Double) : Car(make, model, year, price) {
//    override fun calculateValue(): Double {
//        return price * 0.7
//    }
//}
//
//class Truck(make: String, model: String, year: Int, price: Double) : Car(make, model, year, price) {
//    override fun calculateValue(): Double {
//        return price * 0.6
//    }
//}
//
//data class Customer(
//    val name: String? = null,
//    val age: Int? = null,
//    val budget: Double? = null
//)
//
//enum class PaymentType {
//    CASH, CREDIT, FINANCING
//}
//
//sealed class Order
//class Purchase(
//    val customer: Customer,
//    val car: Car,
//    val paymentType: PaymentType,
//    val purchasePrice: Double
//) : Order()
//
//class Return(val customer: Customer, val car: Car, val returnPrice: Double) : Order()
//
//class CarDealership {
//    val availableCars = mutableListOf<Car>()
//    val purchasedCars = mutableListOf<Purchase>()
//    private val returnedCars = mutableListOf<Return>()
//
//    init {
//        availableCars.addAll(
//            listOf(
//                Sedan("Honda", "Accord", 2022, 25000.0),
//                Sedan("Toyota", "Camry", 2022, 26000.0),
//                SUV("Toyota", "RAV4", 2022, 30000.0),
//                SUV("Honda", "Pilot", 2022, 40000.0),
//                Truck("Ford", "F-150", 2022, 50000.0),
//                Truck("Chevrolet", "Silverado", 2022, 45000.0)
//            )
//        )
//    }
//
//    fun addCar(car: Car) {
//        availableCars.add(car)
//    }
//
//    fun removeCar(car: Car) {
//        availableCars.remove(car)
//    }
//
//    fun processPurchase(customer: Customer, car: Car, paymentType: PaymentType) {
//        val purchasePrice = car.calculateValue()
//        if (customer.budget!! < purchasePrice) {
//            println("Error: You cannot afford this car.")
//            return
//        }
//        val purchase = Purchase(customer, car, paymentType, purchasePrice)
//        purchasedCars.add(purchase)
//        availableCars.remove(car)
//        println("Thank you for your purchase!")
//    }
//
//    fun processReturn(customer: Customer, car: Car) {
//        val returnPrice = car.calculateValue() * 0.9
//        val returnOrder = Return(customer, car, returnPrice)
//        returnedCars.add(returnOrder)
//        purchasedCars.removeIf { it.car == car }
//        availableCars.add(car)
//        println("Thank you for your return!")
//    }
//
//    fun displayAvailableCars() {
//        println("Available cars:")
//        availableCars.forEachIndexed { index, car ->
//            println("${index + 1}. ${car.make} ${car.model} (${car.year}) - $${car.price}")
//        }
//    }
//
//    fun displayPurchasedCars() {
//        println("Purchased cars:")
//        purchasedCars.forEachIndexed { index, purchase ->
//            println("${index + 1}. ${purchase.car.make} ${purchase.car.model} (${purchase.car.year}) - ${purchase.purchasePrice}")
//        }
//    }
//
//    fun displayReturnedCars() {
//        println("Returned cars:")
//        returnedCars.forEachIndexed { index, returnOrder ->
//            println("${index + 1}. ${returnOrder.car.make} ${returnOrder.car.model} (${returnOrder.car.year}) - $${returnOrder.returnPrice}")
//        }
//    }
//}
//
//fun main() {
//    val dealership = CarDealership()
//    val input = readLine()
//    print("Please enter your name: ")
//    val name = input
//
//    print("Please enter your age: ")
//    val age = input?.toInt()
//
//    print("Please enter your budget: ")
//    val budget = input?.toDouble()
//
//    val customer = Customer(name, age, budget)
//
//    while (true) {
//        println()
//        println("What would you like to do?")
//        println("1. Browse available cars")
//        println("2. com.sablot.activity.objects_and_classes.exercises.ten.Purchase a car")
//        println("3. com.sablot.activity.objects_and_classes.exercises.ten.Return a purchased car")
//        println("4. View purchased cars")
//        println("5. View returned cars")
//        println("6. Exit")
//
//        print("Enter your choice: ")
//        when (input?.toInt()) {
//            1 -> dealership.displayAvailableCars()
//            2 -> {
//                dealership.displayAvailableCars()
//                print("Enter the number of the car you would like to purchase: ")
//                val carNumber = input.toInt()
//                val car = dealership.availableCars.getOrNull(carNumber)
//                if (car == null) {
//                    println("Invalid car number.")
//                } else {
//                    println("Selected car: ${car.make} ${car.model} (${car.year}) - $${car.price}")
//                    println("How would you like to pay?")
//                    println("1. Cash")
//                    println("2. Credit")
//                    println("3. Financing")
//                    print("Enter your choice: ")
//                    when (input.toInt()) {
//                        1 -> dealership.processPurchase(customer, car, PaymentType.CASH)
//                        2 -> dealership.processPurchase(customer, car, PaymentType.CREDIT)
//                        3 -> dealership.processPurchase(customer, car, PaymentType.FINANCING)
//                        else -> println("Invalid payment choice.")
//                    }
//                }
//            }
//            3 -> {
//                dealership.displayPurchasedCars()
//                print("Enter the number of the car you would like to return: ")
//                val carNumber = input.toInt()
//                val purchase = dealership.purchasedCars.getOrNull(carNumber)
//                if (purchase == null) {
//                    println("Invalid car number.")
//                } else {
//                    println("Selected car: ${purchase.car.make} ${purchase.car.model} (${purchase.car.year}) - $${purchase.purchasePrice}")
//                    dealership.processReturn(customer, purchase.car)
//                }
//            }
//            4 -> dealership.displayPurchasedCars()
//            5 -> dealership.displayReturnedCars()
//            6 -> return
//            else -> println("Invalid choice.")
//        }
//    }
//}
//
//
