package com.sablot.activity.objects_and_classes.exercises.ten

class Truck(make: String, model: String, year: Int, price: Double) : Car(make, model, year, price) {
    override fun calculateValue(): Double {
        return price * 0.7
    }
}