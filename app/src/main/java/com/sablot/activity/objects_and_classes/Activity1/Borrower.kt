package com.sablot.activity.objects_and_classes.Activity1

data class Borrower(
    override val name: String,
    override val phoneNumber: String,
    override val cardNumber: Long,
) :Person{

    override fun toString(): String {
        return "Name: $name, Phone Number:$phoneNumber, CardNumber: $cardNumber"
    }
}
