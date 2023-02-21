package com.sablot.activity.data_structure

fun main() {
// Create an empty hash map
    val hashMap = HashMap<String, Double>()
    val hashMapString = HashMap<String, String>()

// Add elements to the hash map
    hashMap["Alice"] = 25.0
    hashMap["Bob"] = 32.0
    hashMap["Charlie"] = 19.0
    hashMap["Yoye"] = 24.0
    hashMap["Yoye1"] = 25.0

    hashMapString["Loreleen Mae"] = "Sablot"
    hashMapString["Loreleen"] = "Yoye"
    hashMapString["Yoye"] = "Sablot"
    hashMapString["Ronnel"] = "Remedios"
    hashMapString["Rene"] = "Tresmonte"



// Access elements in the hash map
    println(hashMap["Alice"]) // Output: 25
    println(hashMap["Bob"]) // Output: 32
    println(hashMapString["Ronnel"])

// Iterate over the hash map
    for ((key, value) in hashMap) {
        println("$key: $value")
    }

    for ((key, value) in hashMapString) {
        println("$key: $value")
    }
// Search for value
    val search = readLine()
    println(hashMap[search])

//    activityOne()

}

fun activityOne() {
    val dictionary = HashMap<String, String>()

    while (true) {
        println("Enter a word:")
        val word = readLine()
        if (word.isNullOrBlank()) {
            break
        }
        println("Enter a definition for $word:")
        val definition = readLine()
        if (definition != null) {
            dictionary[word] = definition
        }
    }

    while (true) {
        println("Enter a word to look up:")
        val word = readLine()
        if (word.isNullOrBlank()) {
            break
        }
        val definition = dictionary[word]
        if (definition != null) {
            println("$word: $definition")
        } else {
            println("Definition not found for $word")
        }
    }
}

