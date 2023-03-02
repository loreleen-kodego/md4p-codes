package com.sablot.activity.objects_and_classes.exercises.five

import com.sablot.activity.objects_and_classes.exercises.seven.Color

class Circle(val radius: Double) : Shape() {

    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun kindOfShape(): String {
        return "Circle"
    }

    override fun color(): String {
       return Color.RED.toString().uppercase()
    }
}

class Rectangle(val width: Double, val height: Double) : Shape() {
    override fun area(): Double {
       return width * height
    }

    override fun kindOfShape(): String {
       return "Rectangle"
    }

    override fun color(): String {
        return Color.BLUE.toString().uppercase()    }
}

fun main() {
    val radius = 20.0
    val width = 30.0
    val height = 20.0

    val circle = Circle(radius)
    val rectangle  = Rectangle(width, height)

    println(circle.area().toString())
    println(rectangle.area().toString())
    println(circle.kindOfShape())
    println(rectangle.kindOfShape())
    println(circle.color())
    println(rectangle.color())

}