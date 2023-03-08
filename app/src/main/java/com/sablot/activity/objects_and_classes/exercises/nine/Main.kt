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

var bProperties= ""
var vProperties= 0
var carSel=""
fun main() {
//    enum class - constant value
//    abstract class - base class, once
//    interface - pwedeng multiple

    val vehicles = mutableListOf<Vehicles>()

//    // Create a car and add it to the list
//    val carProperties = mapOf("doors" to 4)
//    val car = createVehicle("car", "Toyota", "Camry", 2021, carProperties)
//    if (car != null) {
//        vehicles.add(car)
//    }


    while (true) {

        println("SElECT OPTION")
        println("1. Create Vehicle")
        println("2. Print Vehicle Info of the vehicles added")
        println("3. exit")

        when (readLine()!!) {

            "1" -> {
                var flag= 1
                while (flag==1) {
                    println("Select Type of Vehicle")
                    println("Input car,truck or bus")
                    val vType = readLine()!!
                    if (vType=="car") {
                        bProperties = "doors" ; vProperties = 4 ; carSel="car" ; flag= 0
                    } else if (vType=="truck") {
                        bProperties = "payload capacity" ; vProperties = 2 ; carSel="truck" ; flag= 0
                    } else if (vType=="bus") {
                        bProperties = "seating capacity"; vProperties = 3; carSel="bus" ; flag= 0
                    } else {
                        println("invalid")
                    }
                }
                    val tProperties =mapOf(bProperties to vProperties)
                    println("Input Make :")
                    val make = readLine()!!
                    println("Input Model : ")
                    val model = readLine()!!
                    println("Input Year : ")
                    val year = readLine()!!
                    if (make.isEmpty() || make.isEmpty() || year.isEmpty()  ){
                        println("Invalid Empty")
                    }
                    else {
                    val yearv = year.toInt()
                    val addVehicles = createVehicle(carSel, make, model, yearv, tProperties)
                    if (addVehicles != null) {
                        vehicles.add(addVehicles)
                        println("SUCCESFULLY ADDED")
                    }
                }

            }
            "2" -> {
                println("two")
                printVehicle(vehicles)
            }
            "3" -> {
                println("\nExiting program...")
                return
            }
            else -> {
                println("\nInvalid option! Please try again.")
            }

        }
        //Create vehicle
        //Print Vehicle Info of the vehicles added
        //Check if the vehicle list is empty or not otherwise add an error text

    }
}

