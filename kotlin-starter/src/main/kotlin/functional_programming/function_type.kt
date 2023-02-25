package functional_programming

fun main() {
    val sumResult = sum?.invoke(10, 10)
    val multiplyResult = multiply.invoke(20, 20)
}

typealias Arithmetic = (Int, Int) -> Int

val sum: Arithmetic = { valueA, valueB -> valueA + valueB }

val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }