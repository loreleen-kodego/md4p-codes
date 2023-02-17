package com.sablot.activity.one

//fun main() {
//    calculateArea()

//    //We use readline() since we need to ask the user for the values needed
//    println("Enter the loan amount: ")
//    val loanAmount: Double = readLine()!!.toDouble()
//    println("Enter the interest rate: ")
//    val interestRate: Double = (readLine()!!.toDouble())
//
//    // We need to convert first the interest rate to decimals. Example 5% == 0.05,
//    // so we need to divide it to 100
//    println("Enter the loan term in months: ")
//    val loanTerm: Double = readLine()!!.toDouble()
//
//    //Let's call the function here
//    calculateMonthlyPayment(loanAmount, interestRate, loanTerm)
//}


fun calculateMonthlyPayment(loanAmount: Double, interestRate: Double, loanTerm: Double) {
    // The formula for calculating monthly payment is P = L[i(1 + i)^n]/[(1 + i)^n – 1]
    // where P = Monthly Payment
    // L = Loan Amount
    // i = interest rate / 12
    // n = loan terms

    //For i variable, we still need the interest rate to be divided to 12,
    var i = interestRate / 12

    //Now the values needed for the formula is complete.

    //Let's try to dissect the formula, there's a repeating instance in the formula this is (1 + i)^n
    //Let's declare a variable for that. We also need to user Math.pow function since it has an exponent ^
    //Let's name it as variable exponent
    val exponent = Math.pow(1 + i, loanTerm)
//    (1 + i).pow(loanTerm)
    // this represents the (1 + i)^n

    //Next, let's complete the formula
    val monthlyPayment = loanAmount * (i * (exponent)) / exponent - 1
    println("Your monthly payment is P$monthlyPayment")
}

// This function will ask five monetary amount from the user
fun askFiveMonetaryAmounts() {
    println("Enter first monetary amount: ")
    val amountOne: Int = readLine()!!.toInt()
    println("Enter second monetary amount: ")
    val amountTwo: Int = readLine()!!.toInt()
    println("Enter third monetary amount: ")
    val amountThree: Int = readLine()!!.toInt()
    println("Enter fourth monetary amount: ")
    val amountFour: Int = readLine()!!.toInt()
    println("Enter fifth monetary amount: ")
    val amountFive: Int = readLine()!!.toInt()

    //Let's call here the function for sum of five monetary amounts inside the println function
    println("The sum of five amounts is:")
    val sum = sumOfAmounts(amountOne, amountTwo, amountThree, amountFour, amountFive)
    println(sum)


    println("Divide the value by how many?: ")
    val divideBy: Int = readLine()!!.toInt()
    println("The result is:")
    println(divideAmount(sum, divideBy))

}

//This function have five parameters, these five parameters represents the five monetary amounts
//It will also print the sum of the five monetary amounts
fun sumOfAmounts(am1: Int, am2: Int, am3: Int, am4: Int, am5: Int): Int {
    return am1 + am2 + am3 + am4 + am5
}

fun divideAmount(totalAmount: Int, divideBy: Int): Int {
    return totalAmount / divideBy
}


fun calculateSquareOfNum(num: Int): Double {
    val exponent = 3
    val result = Math.pow(num.toDouble(), exponent.toDouble())
    return result
}

fun mergeNameAndCity(): String {
    val name = "Loreleen Mae Sablot"
    val city = "Daet Camarines Norte"
    val fullLocation = "$name, $city"
    return fullLocation
}

fun calculateAreaOfRectangle() {
    val length = 25
    val width = 5
    val area = length * width
    println("The area of rectangle is $area")
}

//fun calculateArea() {
//    // (π * radius^2)
//
//    println(Math.PI)
//    val radius = 3
//    Math.pow(radius.toDouble(), 2.0)
//}


//Create a program that implements a simple grade calculation system for a student. The program should allow users to input the student's grades for 6 subjects and calculate the average grade.
//
//
//
//Instructions:
//
//Implement a function "calculateAverage()" to calculate the average grade.
//Implement a function "displayGrades()" to display the student's grades for each subject.
//Allow the user to input the student's grades for 6 subjects.
//Display the student's average grade.

val grade1: Double = 98.0
val grade2: Double = 95.0
val grade3: Double = 92.0
val grade4: Double = 93.0
val grade5: Double = 91.0
val grade6: Double = 92.0


//Leap Year Checker: Write a function that takes in a year and returns whether it is a leap year or not.
//Instructions:
//
//Define a function called "isLeapYear" that takes in a parameter called "year".
//Use an if control structure to determine if the year is a leap year based on the following conditions:
//The year is evenly divisible by 4
//If the year is divisible by 100, it is a leap year only when it is also divisible by 400.
//Return the result.
//fun main() {
//    var counter = 10
//    while (counter <= 10) {
//        println("Counter: $counter")
//        counter++
//    }
//    println("  Leap Year Checker  ")
//
//    print("Enter Year : ")
//    val year: Int = readLine()!!.toInt()
//    isLeapYear(year)

fun calculateAverage(numbers: List<Int>): Double {
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    return sum.toDouble() / numbers.size
}

//    fun main() {
//        val numbers = mutableListOf<Int>()
//        var input: String?
//        do {
//            print("Enter a number (or 'done' to stop): ")
//            input = readLine()
//            if (input != "done") {
//                numbers.add(input!!.toInt())
//            }
//        } while (input != "done")
//        println("Average: ${calculateAverage(numbers)}")
//    }

fun isLeapYear(year: Int) {
    val leapYear = "Leap Year"
    val notALeapYear = "Not a Leap Year"


    if (year % 4 == 0) {
        if (year % 100 == 0) {
            println(notALeapYear)
        } else if (year % 400 == 0) {
            println(leapYear)
        } else println("Try Again")
    }
}


fun askInputFromUser() {
    println("Input year:")
    val input = readLine()!!.toInt()
    println(isLeapYear(input))
}

//fun isLeapYear(year: Int): String {
//    val notALeapYear = "Not a leap year"
//    val aLeapYear = "A leap year"
//
//    //return if else statement sample
//    return if (year % 4 == 0)
//        aLeapYear
//    else if (year % 100 == 0)
//        aLeapYear
//    else if (year % 400 == 0)
//        aLeapYear
//    else notALeapYear
//}

fun arrayChecker() {
    val number = arrayOf(1, 2, 3, 4, 5)
    number.sort()
}

fun isLeapYearVariation(year: Int) {
    val notALeapYear = "Not a leap year"
    val aLeapYear = "A leap year"


    //When statement code sample
    when {
        year % 4 == 0 -> println(aLeapYear)
        year % 100 == 0 -> println(aLeapYear)
        year % 400 == 0 -> println(aLeapYear)
        else -> println(notALeapYear)
    }

    // && || !=

    //Shortest code
    when {
        year % 4 == 0 || year % 100 == 0 || year % 400 == 0 -> println(aLeapYear)
        else -> println(notALeapYear)
    }

}

fun main() {
    var orderMore = true

    do {
        println("What would you like to order? (1. Pizza, 2. Pasta, 3. Salad, 4. Done ordering)")
        val choice = readLine()!!.toInt()

        when (choice) {
            1 -> println("You have ordered a Pizza.")
            2 -> println("You have ordered a Pasta.")
            3 -> println("You have ordered a Salad.")
            4 -> orderMore = false
            else -> println("Invalid option. Please try again.")
        }
    } while (orderMore)

    println("Thank you for your order. Enjoy your meal!")
}

fun calculateGrade(score: Double) {
    val averageA: ClosedFloatingPointRange<Double> = 90.00..99.0
    val averageB: ClosedFloatingPointRange<Double> = 80.0..89.0
    val averageC: ClosedFloatingPointRange<Double> = 70.0..79.0
    val averageD: ClosedFloatingPointRange<Double> = 60.0..69.0
    val averageE: ClosedFloatingPointRange<Double> = 50.0..59.0

    println("")
    when (score) {
        in averageA -> println("Your Average is A")
        in averageB -> println("Your Average is B")
        in averageC -> println("Your Average is C")
        in averageD -> println("Your Average is D")
        in averageE -> println("Your Average is F")
        else -> println("Invalid Entry")
    }

}


fun calculateAverage(
    grade1: Double,
    grade2: Double,
    grade3: Double,
    grade4: Double,
    grade5: Double,
    grade6: Double
) {
    val sum = grade1 + grade2 + grade3 + grade4 + grade5 + grade6
    val average = sum / 6
    println("Your average is $average")
}

fun displayGrades(
    grade1: Double,
    grade2: Double,
    grade3: Double,
    grade4: Double,
    grade5: Double,
    grade6: Double
) {
    println("Your first grade is $grade1")
    println("Your second grade is $grade2")
    println("Your third grade is $grade3")
    println("Your fourth grade is $grade4")
    println("Your fifth grade is $grade5")
    println("Your sixth grade is $grade6")
}

fun inputGrades() {
    println("Input your first grade")
    val grade1: Double = readLine()!!.toDouble()
    println("Input your second grade")
    val grade2: Double = readLine()!!.toDouble()
    println("Input your third grade")
    val grade3: Double = readLine()!!.toDouble()
    println("Input your fourth grade")
    val grade4: Double = readLine()!!.toDouble()
    println("Input your fifth grade")
    val grade5: Double = readLine()!!.toDouble()
    println("Input your sixth grade")
    val grade6: Double = readLine()!!.toDouble()
//    displayGrades(grade1, grade2, grade3, grade4, grade5, grade6)
//    calculateAverage(grade1, grade2, grade3, grade4, grade5, grade6)
}


















