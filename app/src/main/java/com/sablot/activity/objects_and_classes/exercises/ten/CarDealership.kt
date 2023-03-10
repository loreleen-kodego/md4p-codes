package com.sablot.activity.objects_and_classes.exercises.ten

import com.sablot.activity.objects_and_classes.exercises.nine.Cars


class CarDealership(initialCars: List<Car>) {
    private val availableCars: MutableList<Car> = mutableListOf()
    private val purchasedCars: MutableList<SoldCars> = mutableListOf()
    private val returnedCars: MutableList<Car> = mutableListOf()

    init {
        availableCars.addAll(initialCars)
    }

    fun returnCars(): List<Car> {
        return returnedCars
    }
    fun purchaseCars():List<SoldCars>{
        return purchasedCars
    }

    fun browseCars(): List<Car> {
        return availableCars
    }

    fun processPurchase(customer: Customer, car: Car, paymentType: PaymentType): Order? {
        val purchasePrice = car.calculateValue()
        if (purchasePrice > customer.budget) {
            println("Sorry, you cannot afford this car.")
            return null
        }

        println("Processing Payment")
        println("done!!")
        println("Thank you for purchasing")
        availableCars.remove(car)
        val carPrice = car.price
        customer.budget = carPrice
        purchasedCars.add(SoldCars(customer,car))

        return Order.Purchase(customer, car, paymentType, purchasePrice)
    }


    fun processReturn(customer: Customer, car: Car): Order? {
        val returnPrice = car.calculateValue() * 0.8 // 80% of the original price
        purchasedCars.remove(SoldCars(customer,car))
        returnedCars.add(car)

        return Order.Return(customer, car, returnPrice)
    }
}