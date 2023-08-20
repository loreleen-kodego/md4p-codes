package com.sablot.activity.objects_and_classes.exercises.seven

//enum class CoffeeDrinks(val names: String,
//                        val price: Double,
//                        val setOfIngredients: List<String>) {
//    LATTE("Latte", 3.50, listOf("Steamed milk", "Sugar", "Creamer")),
//    CAPPUCCINO("Capuccino", 10.0, listOf("Steamed milk", "Sugar", "Coffee")),
//    AMERICANO("Americano", 8.0, listOf("Sugar", "Coffee"))
//}
//
//
//fun main() {
//    val latte = CoffeeDrinks.LATTE
//    val cappucino = CoffeeDrinks.CAPPUCCINO
//    val americano = CoffeeDrinks.AMERICANO
//    println("Your coffee is ${latte.names} and the price is ${latte.price}")
//    println("Your coffee is ${cappucino.names} and the price is ${cappucino.price}")
//    println("Your coffee is ${americano.names} and the price is ${americano.price}")
//}

//Ronnel
//fun main(){
//    val car1 = Vehicles.CARS
//    val truck1 = Vehicles.TRUCK
//    val motor1 = Vehicles.MOTOR
//
//    println(" I have ${car1.names1} that have ${car1.numberOfWheels} and ${car1.fuelType} with ${car1.setProperties.first()} and ${car1.setProperties.last()}")
//    println(" I have ${truck1.names1} that have ${truck1.numberOfWheels} and ${truck1.fuelType} with ${truck1.setProperties.first()} and ${truck1.setProperties.last()}")
//    println(" I have ${motor1.names1} that have ${motor1.numberOfWheels} and ${motor1.fuelType} with ${motor1.setProperties.first()} and ${motor1.setProperties.last()}")
//}
//
//enum class Vehicles(val names1:String, val numberOfWheels:String, val fuelType:String, val setProperties: List<String>){
//    CARS("Toyota SUV", "4", "Diesel", listOf("Medium in size", "Specialized brakes")),
//    TRUCK("Dump Truck", "10", "Kerosene", listOf("Large in size", "Has normal brakes")),
//    MOTOR("Sport Bike", "3", "LPG", listOf("Small in size", "No Brakes but can stop through feet"))
//}

//Mario
//enum class Vehicles(
//    val vehicleType: String,
//    val numOfWheels: Int,
//    val fuelType: String
//) {
//    MOTORCYCLE("Bike", 2, "Gas"),
//    CARS("Car", 4, "Gas"),
//    TRUCKS("Truck", 6, "Diesel")
//}
//
//fun main() {
//    val motorcyle = Vehicles.MOTORCYCLE
//    val car = Vehicles.CARS
//    val truck = Vehicles.TRUCKS
//    println("Do you wanna ride the ${motorcyle.vehicleType} which has ${motorcyle.numOfWheels} wheels and runs on ${motorcyle.fuelType}?")
//    println("Do you wanna ride the ${car.vehicleType} which has ${car.numOfWheels} wheels and runs on ${car.fuelType}?")
//    println("Do you wanna ride the ${truck.vehicleType} which has ${truck.numOfWheels} wheels and runs on ${truck.fuelType}?")
//
//}

//Ranilo
//fun main() {
//    val car = Vehicles.CAR
//    val motorcycle = Vehicles.MOTORCYCLE
//    val truck = Vehicles.TRUCK
//    println("Vehicle: ${car.names} number of wheels ${car.numberWheel} gas type:${car.fuelType}")
//    println("Vehicle: ${motorcycle.names} number of wheels ${motorcycle.numberWheel} gas type:${motorcycle.fuelType}")
//    println("Vehicle: ${truck.names} number of wheels ${truck.numberWheel} gas type:${truck.fuelType}")
//}
//
//
//enum class Vehicles(val names : String,
//                        val numberWheel : Int,
//                        val fuelType : String ) {
//        CAR("Car" , 4, "gasoline" ),
//        MOTORCYCLE("Motorcycle" , 2, "unleaded" ),
//        TRUCK("TRUCK" , 6, "Deisel" )
//
//    }

//Emilio
//enum class Vehicle(val names: String, val numWheels: Int, val fuelType: String) {
//    Car("Nissan Skyline", 4, "gasoline"),
//    Truck("GMC Topkick", 4, "diesel"),
//    Motorcycle("Harley-Davidson Sportster", 2, "gasoline"),
//}
//
//fun main() {
//    val myCar = Vehicle.Car
//    val myTruck = Vehicle.Truck
//    val myMotorcycle = Vehicle.Motorcycle
//
//    println(myCar.names)
//    println(myTruck.numWheels)
//    println(myMotorcycle.names)
//}

//Paul
//enum class Vehicles(val names: String,
//                    val numberOfWheels: Int,
//                    val fuelType: String) {
//    CARS("Honda", 4, "Gas"),
//    TRUCKS( "Izusu", 4,  "Diesel"),
//    MOTORCYCLES("Honda",  2,  "Gas")
//}
//
//
//fun main() {
//    val cars = Vehicles.CARS
//    val trucks = Vehicles.TRUCKS
//    val motorcycles = Vehicles.MOTORCYCLES
//    println("The vehicle is ${cars.names} and the fuel type is ${cars.fuelType}")
//    println("The vehicle is ${trucks.names} and the fuel type is ${trucks.fuelType}")
//    println("The vehicle is ${motorcycles.names} and the fuel type is ${motorcycles.fuelType}")
//}

//Kyle
//enum class Vehicles(
//    val names : String,
//    val numberOfWheels : Int,
//    val fuelType : String,
//    val typeOfVehicle : List<String>) {
//    CARS("Mitsubishi", 4, "Diesel", listOf("SUV", "Sedan","Sports Car")),
//    TRUCKS("isuzu", 4,"Unleaded", listOf("Tanker Truck","Trailer Truck","Dump Truck")),
//    MOTORCYCLES("Honda",2,"Regular Unleaded", listOf("Click","Scooter"))
//}
//fun main(){
////    Vehicles.CARS
////    Vehicles.TRUCKS
////    Vehicles.MOTORCYCLES
//
//    println("Do you wanna buy a ${Vehicles.CARS.names} gas type ${Vehicles.CARS.fuelType} number of wheels: ${Vehicles.CARS.numberOfWheels} vehicle types: ${Vehicles.CARS.typeOfVehicle}")
//    println("Do you wanna buy a ${Vehicles.TRUCKS.names} gas type ${Vehicles.TRUCKS.fuelType} number of wheels: ${Vehicles.TRUCKS.numberOfWheels} vehicle types: ${Vehicles.TRUCKS.typeOfVehicle}")
//    println("Do you wanna buy a ${Vehicles.MOTORCYCLES.names} gas type ${Vehicles.MOTORCYCLES.fuelType} number of wheels: ${Vehicles.MOTORCYCLES.numberOfWheels} vehicle types: ${Vehicles.MOTORCYCLES.typeOfVehicle}")
//}

//Rene
//enum class DifferentTypesOfVehicles(
//    val vehiclesName:String,
//    val numberOfWheels:String,
//    val fuelType:String
//) {
//
//    Car(vehiclesName ="SUV", numberOfWheels = "4 wheels", fuelType = "diesel"),
//    Truck(vehiclesName = "Ram 3500", numberOfWheels = "6 wheels", fuelType = "gasoline"),
//    Motorcycle(vehiclesName = "Yamaha R1", numberOfWheels = "2 Wheels", fuelType = "Gasoline")
//
//}
//fun main(){
//    val car=DifferentTypesOfVehicles.Car
//    val truck=DifferentTypesOfVehicles.Truck
//    val motorcycle=DifferentTypesOfVehicles.Motorcycle
//
//
//    println("Name: ${car.vehiclesName},number Of Wheels: ${car.numberOfWheels}, fuel Type: ${car.fuelType}")
//    println("Name: ${truck.vehiclesName},number Of Wheels: ${truck.numberOfWheels}, fuel Type: ${truck.fuelType}")
//    println("Name: ${motorcycle.vehiclesName},number Of Wheels: ${motorcycle.numberOfWheels}, fuel Type: ${motorcycle.fuelType}")
//
//}