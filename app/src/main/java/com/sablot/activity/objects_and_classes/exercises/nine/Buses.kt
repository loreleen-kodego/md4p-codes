package com.sablot.activity.objects_and_classes.exercises.nine

class Buses(
    make: String,
    model: String,
    year: Int,
    transmission: Transmission,
    seatingCapacity: Int
) : Vehicle(make, model, year), Driveable {

    override val vehicleType: VehicleType
        get() = VehicleType.BUSES

    override fun drive() {
       println("Driving a bus")
    }
}