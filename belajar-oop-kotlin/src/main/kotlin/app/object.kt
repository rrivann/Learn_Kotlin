package app

import data.Person

fun main() {
    val rivan = Person()

    rivan.firstName = "Rivan"
    rivan.midleName = "Albani"
    rivan.lastName = "Ray"

    println(rivan.firstName)
    println(rivan.midleName)
    println(rivan.lastName)
}