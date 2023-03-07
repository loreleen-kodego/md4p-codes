package com.sablot.activity.objects_and_classes.activity1

data class Borrower(val libraryCardNumber: Int,
                    override val name: String,
                    override val phone: Int): Person {

    override fun getDetails(): String {
        return "Borrower Card #: $libraryCardNumber, Name: $name, Phone Number: $phone"
    }
}

val listOfBorrowers = mutableListOf<Borrower>()

