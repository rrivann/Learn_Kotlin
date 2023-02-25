package control_flow

fun main() {
    val ranges = 1..5
    val ranges2 = 1.rangeTo(10) step 2

    for (i in ranges2) {
        println("value is $i")
    }

    val ranges3 = 1.rangeTo(10) step 3
    for ((index, value) in ranges3.withIndex()) {
        println("value $value with index $index")
    }

    ranges3.forEach { value -> println("value is $value") }

    ranges3.forEachIndexed { index, value -> println("value $value with index $index") }

    ranges.forEachIndexed { index, _ ->
        println("index $index")
    }

}