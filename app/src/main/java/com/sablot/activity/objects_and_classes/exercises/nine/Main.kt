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

    val vehicles = mutableListOf<Vehicles>()
    while (true) {


        println("Selection")
        println("1: Add vehicle to the list")
        println("2:check the vehicle list")


        // Create a car and add it to the list\
        when (readLine()){
            "1"-> {
                println("type of vehicle: car, truck or buses")

                val userResponse = readLine().toString()

                 when (userResponse) {
                    "car" -> {
                        val carProperties = mapOf("doors" to 4)
                        println("make:")
                        val make = readLine().toString()
                        println("Model:")
                        val model = readLine().toString()
                        println("year:")
                        val year = readLine()?.toIntOrNull() ?: continue

                        val car = createVehicle(userResponse, make, model, year, carProperties)
                        if (car!= null){
                            vehicles.add(car)

                        } else{
                            println("Invalid car properties")
                        }

                    }
                     "truck" -> {
                         val truckProperties = mapOf("payload capacity" to 2)
                         println("make:")
                         val make = readLine().toString()
                         println("Model:")
                         val model = readLine().toString()
                         println("year:")
                         val year = readLine()?.toIntOrNull() ?: continue

                         val truck = createVehicle(userResponse, make, model, year, truckProperties)
                         if (truck!= null){
                             vehicles.add(truck)

                         } else{
                             println("Invalid truck properties")
                         }

                     }
                     "bus" -> {
                         val busProperties = mapOf("seating capacity" to 30)
                         println("make:")
                         val make = readLine().toString()
                         println("Model:")
                         val model = readLine().toString()
                         println("year:")
                         val year = readLine()?.toIntOrNull() ?: continue

                         val bus = createVehicle(userResponse, make, model, year, busProperties)
                         if (bus!= null){
                             vehicles.add(bus)

                         } else{
                             println("Invalid car properties")
                         }
                     }


                    else -> {

                        println("Invalid vehicle response")
                    }
                }


            }
            "2"->{
                println(vehicles)
            }




        }
                //Print vehicle info
                printVehicle (vehicles)

        //Create vehicle
        //Print Vehicle Info of the vehicles added
        //Check if the vehicle list is empty or not otherwise add an error text
    }
}
