package com.hadihariri.kotlincourse.tidbits

/**
 * Created by hadihariri on 24/08/16.
 */

fun capitalAndPopulation(country: String): Pair<String, Long> {
    return Pair("Madrid", 2300000)
}

fun countryInformation(country: String): Triple<String, String, Long> {
    return Triple("Madrid", "Europe", 2300000)
}
fun main(args: Array<String>) {

    val result = capitalAndPopulation("Madrid")



    val countryInfo = countryInformation("Spain")
    countryInfo.third

    val (capital, continent, population) = countryInformation("Madrid")

    val listCapitalsAndCountries = listOf(Pair("Madrid", "Spain"), "Paris" to "France")

    for ((capital2, country) in listCapitalsAndCountries) {
        println("$capital2 - $country")
    }

}
