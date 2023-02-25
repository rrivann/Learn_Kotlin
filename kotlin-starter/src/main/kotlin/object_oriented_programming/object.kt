package object_oriented_programming

fun main() {
    val someString = "Dicoding"
    println(someString.reversed())
    println(someString.uppercase())
    println(someString.lowercase())

    val someString2 = "123"
    val someInt = someString2.toInt()
    val someOtherString = "12.34"
    val someDouble = someOtherString.toDouble()

    println(someInt is Int)
    println(someDouble is Double)

}