package com.sablot.activity.objects_and_classes.exercises.nine

class Truck(
    make: String,
    model: String,
    year: Int,
    transmission: Transmission,
    payloadCapacity: Int
) : Vehicle(make, model, year), Driveable {

    override fun drive() {
        println("Driving a truck")
    }

    override val vehicleType: VehicleType
        get() = VehicleType.TRUCKS
}