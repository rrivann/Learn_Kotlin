package app

import data.Person

fun main() {
    val rivan = Person()
    rivan.firstName = "Rivan"

    rivan.sayHello("Bydu")
    rivan.sayHello("Joko", "Nugroho")
}