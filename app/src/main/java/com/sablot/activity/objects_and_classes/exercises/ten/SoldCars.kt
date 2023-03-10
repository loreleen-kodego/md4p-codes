package com.sablot.activity.objects_and_classes.exercises.ten

data class SoldCars(
    val customer: Customer,
    val car: Car

){

    override fun toString(): String {
        return "Buyer: $customer, model: $car"
    }
}
