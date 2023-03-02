package com.sablot.activity.objects_and_classes.exercises.nine

abstract class Vehicle(
    val make: String,
    val model: String,
    val year: Int
) {
    abstract val vehicleType: VehicleType
}