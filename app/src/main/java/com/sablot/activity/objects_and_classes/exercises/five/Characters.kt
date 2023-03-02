package com.sablot.activity.objects_and_classes.exercises.five

class Characters(val type: String) : Behaviors() {

    override fun attack(): String {
       return when (type) {
           "Marksman" -> "Range"
           "Mage" -> "Magic Damage"
           "Fighter" -> "True Damage"
           "Cancer" -> "Emotional Damage"
           else -> "Minion"
       }
    }

    override fun movement(): String {
        return when (type) {
            "Marksman" -> "Top"
            "Mage" -> "Bottom"
            "Fighter" -> " Mid"
            "Cancer" -> "Farm"
            else -> "Roam"
        }
    }
}

fun main() {
    println("What is your character in Mobile Legends?")
    val input = readLine().toString()
    val character = Characters(input)
    println("You're characters attack is ${character.attack()}")
    println("You're characters movement is ${character.movement()}")

}

