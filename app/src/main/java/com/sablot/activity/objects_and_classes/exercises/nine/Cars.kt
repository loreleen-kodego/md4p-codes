package com.sablot.activity.objects_and_classes.exercises.nine

//Define a class for cars that inherits from Vehicle
class Cars(
    make: String,
    model: String,
    year: Int,
    val numberOfDoors: Int) : Vehicles(make, model, year) {

        init {
            vehicleType = "Cars"
            uniqueCharacteristic = "$numberOfDoors doors"
            fuelType = FuelType.ELECTRIC
            maintenanceDate = "2020"
        }
}