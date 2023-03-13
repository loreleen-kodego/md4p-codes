package com.sablot.activity.objects_and_classes.exercises.ten_2

data class Customer(val name: String,
                    val age: Int,
                    val budget: Int) {
    fun getInfo(): String {
        return "Customer: $name"
    }
}