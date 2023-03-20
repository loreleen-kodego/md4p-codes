package com.sablot.activity.objects_and_classes.exercise10

//class CarDealership (private var availableCars: MutableList<Car>) {
//    constructor() : this(MutableList<Car>())
//
//
//
//
//    private var purchasedCars: MutableList<Car> = mutableListOf()
//    private var returnedCars: MutableList<Car> = mutableListOf()
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
//        if (customer.budget < car.price) {
//            println("Error: The selected car is too expensive for your budget.")
//            return
//        }
//
//        val purchasePrice = when(paymentType) {
//            PaymentType.CASH -> car.calculateValue()
//            PaymentType.CREDIT_CARD -> car.calculateValue() * 1.05
//            PaymentType.FINANCING -> car.calculateValue() * 1.1
//        }
//
//        val order = Order.Purchase(customer, car, paymentType, purchasePrice)
//        purchasedCars.add(car)
//        availableCars.remove(car)
//        println("Purchase successful!")
//    }
//
//    fun processReturn(customer: Customer, car: Car, returnPrice: Double) {
//        val order = Order.Return(customer, car, returnPrice)
//        returnedCars.add(car)
//        availableCars.add(car)
//        println("Return successful!")
//    }
//
//    fun displayAvailableCars() {
//        println("Available Cars:")
//        for (car in availableCars) {
//            println("${car.make} ${car.model} (${car.year}) - $${car.price}")
//        }
//        println()
//    }
//}