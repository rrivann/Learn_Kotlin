package app

import data.Application
import data.Utilities

fun main() {
    Utilities.name = "Dirubah"
    println(Utilities.toUpper("Rivan"))
    a()
    b()

    println(Application.toUpper("Rivan"))
}

fun a(){
    println(Utilities.name)
}

fun b(){
    println(Utilities.name)
}