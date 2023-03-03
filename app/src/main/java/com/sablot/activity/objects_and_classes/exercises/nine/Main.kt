package com.sablot.activity.objects_and_classes.exercises.nine

import com.sablot.activity.objects_and_classes.exercises.ten.Car

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
fun printVehicles(vehicles: MutableList<Vehicles>) {
    for (vehicle in vehicles) {
        println(vehicle.getInfo())
    }
}
fun main() {
    //enum class - constant value
    //abstract class - base class, once
    //interface - pwedeng multiple

    val vehicles = mutableListOf<Vehicles>()

    while (true) {
        println("Choose: car, truck, bus, display, or exit")
        val choose = readLine() ?: break
        when (choose) {
            "car" -> {
               Cars(vehicles)
            }
            "bus" -> {
                Buses(vehicles)
            }

            "truck" -> {
              Truck(vehicles)
            }
            "display" -> {
                printVehicles(vehicles)

            }
            else -> {
                return
            }
        }
    }
}

fun Truck(vehicles:MutableList<Vehicles>){
    println("Enter Truck Payload Capacity: ")
    val payloadCapacity = readLine()!!.toInt()
    var truckProperties = mapOf("payload capacity" to payloadCapacity)
    println("Enter Truck Type: ")
    val truckType = readLine() ?: " "
    println("Enter Truck Brand: ")
    val truckBrand = readLine() ?: " "
    println("Enter Truck Version: ")
    val truckVersion = readLine() ?: ""
    println("Enter Truck Year: ")
    val truckYear = readLine()?.toIntOrNull() ?: 0
    val truck = createVehicle(truckType, truckBrand, truckVersion, truckYear, truckProperties)
    if (truck != null) {
        vehicles.add(truck)
    }
}

fun Cars(vehicles:MutableList<Vehicles>){
    println("Enter car Window: ")
    val numberOfDoors = readLine()!!.toInt()
    var carProperties = mapOf("doors" to numberOfDoors)
    println("Enter car Type: ")
    val carType = readLine() ?: " "
    println("Enter car Brand: ")
    val carBrand = readLine() ?: " "
    println("Enter car Version: ")
    val carVersion = readLine() ?: ""
    println("Enter car Year: ")
    val carYear = readLine()?.toIntOrNull() ?: 0
    val car = createVehicle(carType, carBrand, carVersion, carYear, carProperties)
    if (car != null) {
        vehicles.add(car)
    }
}
fun Buses(vehicles: MutableList<Vehicles>)
{
    println("Enter Bus Seating Capacity: ")
    val seatingCapacity = readLine()!!.toInt()
    var busProprties = mapOf("seating capacity" to seatingCapacity)
    println("Enter Bus Type: ")
    val busType = readLine() ?: " "
    println("Enter Bus Brand: ")
    val busBrand = readLine() ?: " "
    println("Enter Bus Version: ")
    val busVersion = readLine() ?: ""
    println("Enter Bus Year: ")
    val busYear = readLine()?.toIntOrNull() ?: 0
    val bus = createVehicle(busType, busBrand, busVersion, busYear, busProprties)
    if (bus !=null){
        vehicles.add(bus)
    }
}