package app

import data.Application

typealias App = Application

typealias  StringSupplier = () -> String

fun sayHello(supplier: StringSupplier) {
    println("Hello ${supplier()}")
}

fun main() {
    val app = App("Kotlin App")

    sayHello { "Rivan" }
}