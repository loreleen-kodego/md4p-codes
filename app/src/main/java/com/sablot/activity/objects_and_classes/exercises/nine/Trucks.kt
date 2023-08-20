package com.sablot.activity.objects_and_classes.exercises.nine

class Trucks (
    make: String,
    model: String,
    year: Int,
    val payloadCapacity: Int) : Vehicles(make, model, year) {

    init {
        vehicleType = "Trucks"
        uniqueCharacteristic = "Payload capacity: $payloadCapacity"
        fuelType = FuelType.HYBRID
        maintenanceDate = "2010"
    }
}