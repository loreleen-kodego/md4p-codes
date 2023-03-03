package com.sablot.activity.objects_and_classes.exercises.nine

fun createVehicle(
    type: String,
    make: String,
    model: String,
    year: Int,
    properties: Map<String, Any>
): Vehicles? {

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
    val vehicles = mutableListOf<Vehicles>()
    while (true) {
        println("1. Create a Vehicle.")
        println("2. Show Vehicles.")
        println("3. Exit.")
        print("Select option: ")
        when (readLine()?.toIntOrNull() ?: 4) {
            1 -> {
                println("what do you want to build?")
                val response = readLine().toString()
                when (response) {
                    "car" -> {
                        println("enter door")
                        val door = readLine()!!.toInt()
                        val carProperties = mapOf("doors" to door)
                        println("enter brand")
                        val make = readLine().toString()
                        println("enter model")
                        val model = readLine().toString()
                        println("enter year")
                        val year = readLine()!!.toInt()
                        val car = createVehicle(response, make, model, year, carProperties)
                        if (car != null) {
                            vehicles.add(car)
                        }
                    }
                    "truck" -> {
                        println("enter payload capacity")
                        val payload = readLine()!!.toInt()
                        val truckProperties = mapOf("payload capacity" to payload)
                        println("enter brand")
                        val make = readLine().toString()
                        println("enter model")
                        val model = readLine().toString()
                        println("enter year")
                        val year = readLine()!!.toInt()
                        val truck = createVehicle(response, make, model, year, truckProperties)
                        if (truck != null) {
                            vehicles.add(truck)
                        }
                    }
                    "bus" -> {
                        println("enter seating capacity")
                        val seating = readLine()!!.toInt()
                        val busProperties = mapOf("seating capacity" to seating)
                        println("enter brand")
                        val make = readLine().toString()
                        println("enter model")
                        val model = readLine().toString()
                        println("enter year")
                        val year = readLine()!!.toInt()
                        val bus = createVehicle(response, make, model, year, busProperties)
                        if (bus != null) {
                            vehicles.add(bus)
                        }
                    }
                }
            }
            2 -> {
                if (vehicles.isEmpty()){
                    println("\nNo Vehicles!\n")
                }
                else {
                    printVehicle(vehicles)
                }
            }
            3 -> {
                return
            }
            4 -> {
                println("\nInvalid option!\n")
                continue
            }
        }
    }
}