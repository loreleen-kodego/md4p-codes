package com.sablot.activity.objects_and_classes.exercises.nine

class Buses(
    make: String,
    model: String,
    year: Int,
    val seatingCapacity: Int) : Vehicles(make, model, year) {

    init {
        vehicleType = "Bus"
        uniqueCharacteristic = "Seating capacity: $seatingCapacity"
        fuelType = FuelType.GAS
        maintenanceDate = "2000"
    }
}