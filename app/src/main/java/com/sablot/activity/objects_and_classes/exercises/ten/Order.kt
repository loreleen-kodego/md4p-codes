package com.sablot.activity.objects_and_classes.exercises.ten


sealed class Order {
    class Purchase(val customer: Customer, val car: Car, val paymentType: PaymentType, val purchasePrice: Double) : Order()
    class Return(val customer: Customer, val car: Car, val returnPrice: Double) : Order()
}