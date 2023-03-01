package com.sablot.activity.objects_and_classes.exercises.four

data class Country(
    val name: String?,
    val population: Int?,
    val landArea: Double?,
    val gdp: Double?
) {
    init {
        require(name?.isNotBlank() == true) {"Name cannot be blank"}
        require(population!! > 0) {"Population must be greater than 0"}
        require(landArea!! > 0) {"Land area must be greater than 0"}
        require(gdp!! > 0) {"GDP must be greater than 0"}
    }

    val gdpPerCapita = population?.let { gdp?.div(it) }

    companion object {
        fun sortByPopulation(countries: List<Country>) : List<Country> {
            return countries.sortedByDescending { it.population }
        }

        fun sortByGdpPerCapita(countries: List<Country>) : List<Country> {
            return countries.sortedByDescending { it.gdpPerCapita }
        }
    }
}

fun main() {

    val countries = mutableListOf<Country>()

    while (true) {
        println("Enter the country name")
        val countryName = readLine().toString()

        if (countryName.isBlank()) {
            println("\nPlease enter country name")
            continue
        } else if (countryName == "done") break

        println("Enter population: ")
        val countryPopulation = readLine()?.toInt()

        println("Enter land area (in square kilometers ")
        val countryLandArea = readLine()?.toDouble()

        println("Enter GDP in millions of Pesos: ")
        val countryGDP = readLine()?.toDouble()?.times(1_000_000)

        val country = Country(countryName, countryPopulation, countryLandArea, countryGDP)

        countries.add(country)
    }

    val countriesByPopulation = Country.sortByPopulation(countries)
    val countriesByGDPperCapita = Country.sortByGdpPerCapita(countries)

    println("Countries sorted by Population")
    countriesByPopulation.forEach {
        println(it.name.toString() + " " + it.population.toString())
    }

    println("Countries sorted by GDP per capita")
    countriesByGDPperCapita.forEach {
        println(it.name + " " + " P" + String.format("%.2f", it.gdpPerCapita))
    }

    //Sample push

}