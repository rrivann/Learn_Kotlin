package app

import data.HandPhone
import data.Laptop

fun printObject(any: Any) {
    when (any) {
        is Laptop -> println("Laptop with name ${any.name}")
        is HandPhone -> println("HandPhone with name ${any.name}")
        else -> println(any)
    }
    println(any)
}

fun printString(any: Any) {
    val value = any as? String
    println(value)
}

fun main() {
    printString("Rivan")
    printString(1)


    printObject("Rivan")
    printObject(1)
    printObject(Laptop("Macbook"))
    printObject(HandPhone("Iphone"))
}
