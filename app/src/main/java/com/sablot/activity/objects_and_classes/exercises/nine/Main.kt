package com.sablot.activity.objects_and_classes.exercises.nine

fun main() {
    val vehicles = listOf(
        Car("Toyota", "Camry", 2022, 4, Transmission.AUTOMATIC),
        Truck("Ford", "F-150", 2021, Transmission.MANUAL, 100),
        Buses("Volvo", "B12BLE", 2002, Transmission.MANUAL, 6)
    )

    for (vehicle in vehicles) {
        println("${vehicle.make} ${vehicle.model} ${vehicle.year} - ${vehicle.vehicleType}:")
        when (vehicle) {
//            is Car -> println("  $${vehicle.} doors, ${vehicle.transmission} transmission")
//            is Truck -> println("  Payload capacity: ${vehicle.vehicleType} lbs, ${vehicle.transmission} transmission")
//            is Buses -> println("  Seating capacity: ${vehicle.seatingCapacity}")
        }
        vehicle.drive()
        println()
    }

}