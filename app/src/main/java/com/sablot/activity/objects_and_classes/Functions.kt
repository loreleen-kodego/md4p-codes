package com.sablot.activity.objects_and_classes



fun drive(speed: String = "fast",
          typeOfCar: String,
          isSedan: Boolean,
          price: Double) = println("driving $speed $typeOfCar")

fun double(x: Int) : Int = x * 2

val walterFilter: (Int) -> Int = {
    it/2
}

val enc1: (String) -> String = {
    it.uppercase()
}

val colors = listOf<String>(
    "red", "red-orange", "dark-red", "orange", "bright-orange", "saffron"
)

fun main() {
    println(colors.filter {
        it.contains("red")
    })
    println(books.filter {
        it[1] == 'b'
    })
    drive(speed = "slow",typeOfCar = "Lambo", isSedan = false, price = 200000.00)
    val instruments = listOf("viola", "cello", "violin")
    val filtered = instruments.asSequence().filter {
        it[0] == 'v'
    }

    val newList = filtered.toList()
    println("New list: $newList")

    val numberSets = listOf(setOf("viola", "cello"), setOf(1, 2, 4), setOf(1.2, 1.9, 2.3))
    println(numberSets.flatten().asReversed())
}

val books = listOf("nature", "biology", "birds", "absolute")




