package com.sablot.activity.objects_and_classes.classes

class House {
    var color : String ="white"
    var numberOfWindows: Int = 2
    var isForSale: Boolean = false


    fun updateColor(newColor : String) {
        color = newColor
    }

    fun updateNumberOfWindows(number: Int) {
        numberOfWindows = number
    }

    init {
        color = "Black"
    }

}


