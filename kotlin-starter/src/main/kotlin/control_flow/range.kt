package control_flow

fun main() {
    val rangeInt = 1..10 step 2
    rangeInt.forEach { println("$it ") }
    println(rangeInt.step)

    val rangeInt2 = 1.rangeTo(10)
    val tenToOne = 10.downTo(1)

    if (7 in tenToOne) {
        println("Value 7 available")
    }

    if (11 !in tenToOne) {
        println("No value 11 in range")
    }

    val rangeChar = 'A'.rangeTo('F')
    println(rangeChar)
}