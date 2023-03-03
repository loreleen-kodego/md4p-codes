package com.sablot.activity.objects_and_classes.exercises.nine


//Define a base class for all vehicles
abstract class Vehicles(
    val make: String,
    val model: String,
    val year: Int
) {

    var vehicleType : String = ""
    var uniqueCharacteristic: String = ""
    var fuelType: FuelType? = null
    var maintenanceDate: String = ""

    fun getInfo() : String {
        return "Make: $make, Model: $model, Year: $year, " +
                "Type: $vehicleType, Unique Characteristic: $uniqueCharacteristic, " +
                "Maintenance Date: $maintenanceDate"
    }
}

enum class FuelType {
    GAS,
    ELECTRIC,
    HYBRID
}