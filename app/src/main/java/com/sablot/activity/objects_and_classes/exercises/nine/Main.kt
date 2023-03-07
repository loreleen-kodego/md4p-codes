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
    //interface - allows multiple

    val vehicles = mutableListOf<Vehicles>()

    while (true) {
        println("Choose from the following")
        println("[1] Add Car")
        println("[2] Add Bus")
        println("[3] Add Truck")
        println("[4] Exit")

        when(readLine()!!.toInt()) {
            1 -> addCar(vehicles)
            2 -> addBus(vehicles)
            3 -> addTruck(vehicles)
            4 -> break
            else -> println("Invalid keyword")
        }

        //Print vehicle info
        printVehicle(vehicles)

        //Create vehicle
        //Print Vehicle Info of the vehicles added
        //Check if the vehicle list is empty or not otherwise add an error text
    }


}

fun addCar(vehicles: MutableList<Vehicles>) {

    println("Enter car details")
    print("Brand: ")
    val brand = readLine().toString()
    print("Model: ")
    val model = readLine().toString()
    print("Year: ")
    val year = readLine()!!.toInt()
    print("Number of doors: ")
    val numberOfDoors = readLine()!!.toInt()

    // Create a car and add it to the list
    val carProperties = mapOf("doors" to numberOfDoors)
    val car = createVehicle("car", brand, model, year, carProperties)
    if (car != null) {
        vehicles.add(car)
    }
}

fun addBus(vehicles: MutableList<Vehicles>) {

    println("Enter bus details")
    print("Brand: ")
    val brand = readLine().toString()
    print("Model: ")
    val model = readLine().toString()
    print("Year: ")
    val year = readLine()!!.toInt()
    print("Seating Capacity: ")
    val seatingCapacity = readLine()!!.toInt()

    // Create a bus and add it to the list
    val busProperties = mapOf("seating capacity" to seatingCapacity)
    val bus = createVehicle("bus", brand, model, year, busProperties)
    if (bus != null) {
        vehicles.add(bus)
    }
}

fun addTruck(vehicles: MutableList<Vehicles>) {

    println("Enter truck details")
    print("Brand: ")
    val brand = readLine().toString()
    print("Model: ")
    val model = readLine().toString()
    print("Year: ")
    val year = readLine()!!.toInt()
    print("Payload Capacity: ")
    val payloadCapacity = readLine()!!.toInt()

    // Create a truck and add it to the list
    val truckProperties = mapOf("seating capacity" to payloadCapacity)
    val truck = createVehicle("truck", brand, model, year, truckProperties)
    if (truck != null) {
        vehicles.add(truck)
    }
}

