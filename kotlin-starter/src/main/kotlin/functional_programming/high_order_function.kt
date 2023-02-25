package functional_programming

fun main() {
    printResult(10, sumHigh)

    printResult(10) { value ->
        value + value
    }
}

var sumHigh: (Int) -> Int = { value -> value + value }

inline fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}