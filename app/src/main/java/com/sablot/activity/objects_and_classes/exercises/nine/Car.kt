package com.sablot.activity.objects_and_classes.exercises.nine

class Car(make: String,
          model: String,
          year: Int,
          numberOfDoors: Int,
          val transmission: Transmission

) : Vehicle(make, model, year), Driveable {

    override fun drive() {
        println("Driving car")
    }

    override val vehicleType: VehicleType
        get() = TODO("Not yet implemented")

}