package com.sablot.activity.objects_and_classes.exercises.ten

fun  main() {

    val sedan1 = Sedan("Honda", "Civic", 2018, 15000.0,)
    val sedan = Sedan("Honda", "Accord", 2021, 27000.0)
    val suv = SUV("Chevrolet", "Tahoe", 2021, 40000.0)
    val suv1=SUV("Honda", "CR-V", 2017, 19000.0,)
    val truck = Truck("Ford", "F-150", 2020, 40000.0)

    val initialCars = listOf(sedan1,sedan, suv,suv1, truck)

    val carDealership = CarDealership(initialCars)

    while (true){
        println("1:Buy a Car")
        println("2:Return a Car")
        println("3:Show Purchased Cars")
        println("4:Show returned Cars")
        println("5,Exit")

        val response = readLine()?:""

        when(response){
            "1"->{

                println("Enter your Name:")
                val name = readLine().toString()
                println("Age:")
                val age = readLine()!!.toInt()
                println("Budget:")
                val budget = readLine()!!.toDouble()

                val customerInfo = Customer(name, age, budget)

                println("Thank you for providing your information, now! you can proceed.")

                println("Available car")
                for (car in carDealership.browseCars())
                    println(car)


                println("Select your choice by typing name of a car")
                val customerResponse = readLine()?.trim() ?: ""

                val customerChoices = carDealership.browseCars().filter { it.make == customerResponse }

                if (customerChoices.isEmpty()) {
                    println("Sorry, we don't have any cars of that make.")
                } else {
                    println("Here are the cars of make '$customerResponse' we have:")

                    // Print details of all the matching cars
                    customerChoices.forEach {
                        println("${it.make} ${it.model} (${it.year}), ${it.price}")
                    }

                    // Prompt the customer to make a choice
                    println("Type the model name of the car you want to buy:")
                    val customerChoice = readLine()?.trim() ?: ""

                    val selectedCar = customerChoices.find { it.model == customerChoice }

                    if (selectedCar != null) {

                        val customerChoice ="${selectedCar.make} ${selectedCar.model} (${selectedCar.year}), ${selectedCar.price}"
                        println(customerChoice)

                        println("Select the Payment Method:")
                        println("1: Cash")
                        println("2: CREDIT_CARD")
                        println("3:Exit")
                        val payment = readLine() ?: ""

                        when (payment) {
                            "1" -> {
                                val paymentmethod = PaymentType.CASH
                                carDealership.processPurchase(customerInfo, selectedCar, paymentmethod)

                            }
                            "2"->{
                                val paymentmethod = PaymentType.CREDIT_CARD
                                carDealership.processPurchase(customerInfo, selectedCar, paymentmethod)
                            }
                            "3"->{

                                println("Exiting Program....")
                                break
                            }
                        }

                    } else {
                        println("Sorry, we don't have any cars of make '$customerResponse' with model '$customerChoice'.")
                    }
                }

            }
            "2"->{

                println("Enter your Name:")
                val name = readLine().toString()
                println("Age:")
                val age = readLine()!!.toInt()
                println("Car Price:")

                val price = readLine()!!.toDouble()

                val customerInfo = Customer(name, age,price)

                val findCarData = carDealership.purchaseCars().find { it.customer == customerInfo}
                if (findCarData!=null){
                    val userData = "${findCarData.customer},${findCarData.car}"
                    println("Matched Data")
                    println(userData)
                    println("Car return process. Please wait 7-14 days to receive your refund.")

                    carDealership.processReturn(customerInfo,findCarData.car)
                }else{
                    println("Sorry, your information does not exist in our customer data.")
                }

            }
            "3"->{
                for (car in carDealership.purchaseCars()){
                    println(car)
                }
            }
            "4"->{
                for (car in carDealership.returnCars()){
                    println(car)
                }
            }
            "5"->{
                println("Exiting Program.....")
                break
            }

        }

    }



}
