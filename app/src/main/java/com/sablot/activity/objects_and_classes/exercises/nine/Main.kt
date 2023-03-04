package com.sablot.activity.objects_and_classes.exercises.nine


//Define a function to create a vehicle based on the given type of properties of classes
fun createVehicle(type: String,
                  make: String,
                  model: String,
                  year: Int,
                  properties: Map<String, Any>) : Vehicles? {

    return when (type) {
        "car" -> {
          val doors = properties["doors"] as? Int ?: return null
          Cars(make, model, year, doors)
        }
        "truck" -> {
            val payloadCapacity = properties["payload capacity"] as? Int ?: return null
            Trucks(make, model, year, payloadCapacity)
        }
        "bus" -> {
            val seatingCapacity = properties["seating capacity"] as? Int ?: return null
            Buses(make, model, year, seatingCapacity)
        }
        else -> null
    }
}

fun printVehicle(vehicles: List<Vehicles>) {
    for (vehicle in vehicles) {
        println(vehicle.getInfo())
    }
}


fun main() {
    //enum class - constant value
    //abstract class - base class, once
    //interface - pwedeng multiple

//    val vehicles = mutableListOf<Vehicles>()
//
//    // Create a car and add it to the list
//    val carProperties = mapOf("doors" to 4)
//    val car = createVehicle("car", "Toyota", "Camry", 2021, carProperties)
//    if (car != null) {
//        vehicles.add(car)
//    }
//
//    // Create a truck and add it to the list
//    val truckProperties = mapOf("payload capacity" to 2)
//    val truck = createVehicle("truck", "Ford", "F-150", 2021, truckProperties)
//    if (truck != null) {
//        vehicles.add(truck)
//    }
//
//    // Create a bus and add it to the list
//    val busProperties = mapOf("seating capacity" to 30)
//    val bus = createVehicle("bus", "Blue Bird", "Vision", 2021, busProperties)
//    if (bus != null) {
//        vehicles.add(bus)
//    }
//
//    //Print vehicle info
//    printVehicle(vehicles)

    //Create vehicle
    //Print Vehicle Info of the vehicles added
    //Check if the vehicle list is empty or not otherwise add an error text

    val vehicles = mutableListOf<Vehicles>()

fun addCars(vehicles: MutableList<Vehicles>) {
    println("Enter the details of Car:")
    println("Brand: ")
    val brand = readLine()!!.toString()
    println("Model: ")
    val model = readLine()!!.toString()
    println("Year: ")
    val year = readLine()!!.toInt()
    println("How many doors?: ")
    val doors = readLine()!!.toInt()

}

fun addTrucks(vehicles: MutableList<Vehicles>) {
     println("Enter the details of Truck:")
     println("Brand: ")
     val brand = readLine()!!.toString()
     println("Model: ")
     val model = readLine()!!.toString()
     println("Year: ")
     val year = readLine()!!.toInt()
     println("What is the Payload Capacity?: ")
     val payLoadCapacity = readLine()!!.toInt()

}

fun addBuses(vehicles: MutableList<Vehicles>) {
    println("Enter the details of Bus:")
    println("Brand: ")
    val brand = readLine()!!.toString()
    println("Model: ")
    val model = readLine()!!.toString()
    println("Year: ")
    val year = readLine()!!.toInt()
    println("What is the seating capacity?: ")
    val seatingCapacity = readLine()!!.toInt()


}














}

