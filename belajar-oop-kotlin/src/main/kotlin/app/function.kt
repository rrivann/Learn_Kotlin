package app

import data.Person

fun main() {
    val rivan = Person()
    rivan.firstName = "Rivan"
    rivan.midleName = "Albani"
    rivan.lastName = "Ray"

    rivan.sayHello("Budi")
    rivan.run()
    val fullName = rivan.getFullName()
    println(fullName)
}