package com.sablot.activity.strings

import android.util.Log

//fun com.sablot.activity.objects_and_classes.exercises.ten.main() {
//    val string1 = "Hello"
//    val string2 = "World"
//    val concatenatedString = "$string1 $string2"
//    println(concatenatedString)

//    val name = "Yiye"
//    println("Hello $name")

//    val string = "Hello World"
//    println(string.substring(2, 8))

//    val string = "Hello World"
//    print(string.replace("Hello", "Yoye's"))

//    val string = "12  Hello World-  -"
//    println(string.trim())

//    val string = "Loreleen Mae Sablot"
//    println(string.length)

//    val string = "Loreleen Mae Sablot"
//    println(string.uppercase())
//    println(string.lowercase())

//    val string = "Emilio Manuel Cebu"
//    val words = string.split(" ")
//    println(string)
//    println(words)
//    println(words[0][0])
//    println(words[1][0])
//    println(words[2][0])

//    val string = "Loreleen Mae Sablot"
//    println(string.contains("Yoye"))

//    val string = "Hello World"
//    println(string.indexOf("l"))

//    val string = "Loreleen Mae Sablot"
//    println(string.startsWith("Loreleen"))
//    println(string.endsWith("Sablot"))

//    var name: String? = "John"
//    name = null
//    println(name)
//
//    val name: String? = null
//    val length = name?.length ?: 0
//    println(length)

//    val age: Int? = null
//    val ageInYears = age?.toString() ?: "Kodego"
//    println(ageInYears)

//    var name = "Hello"
//    var computation = name?.let {
//        it.length
//    }
//    println(computation)

//    val email: String? = "testemail@gmail.com"
//    val parts = email?.split("@") ?: arrayOf("Unknown")
//    val domain = parts.lastOrNull() ?: "Unknown"
//    println("Domain: $domain")
//
//    val email: String? = readLine()
//    val parts = email?.split("@")
//    val domain = parts?.last()
//    println("Domain: $domain")

//    val text = "The quick brown fox jumps over the lazy dog."
//
//}

//Activity 1
fun main() {
//    println("Enter your phone number: ")
//    val phoneNumber: String? = readLine()
//    val formattedNumber = if (phoneNumber?.length == 10) {
//        "( ${phoneNumber.substring(0, 3)}) ${phoneNumber.substring(3, 6)}-${phoneNumber.substring(6)}"
//    } else {
//        "Invalid Phone Number"
//    }
//    println(formattedNumber)
   val text = "Loreleen Mae Sablot"
    println(reverseWords(text))
}

//Activity 2
fun activityTwo() {
    val fileName = readLine()
    val parts = fileName?.split(".")
    val extension = parts?.lastOrNull()
    if (extension == null) println("No extension") else println("Extension: $extension")
}

fun reverseWords(text: String): String {
    val words = text.split(" ")
    var reversedText = ""

    for (i in words.lastIndex downTo 0) {
        reversedText += "${words[i]} "
    }

    reversedText = reversedText.trim()

    return reversedText
}
