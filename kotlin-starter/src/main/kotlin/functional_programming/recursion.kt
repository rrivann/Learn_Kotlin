package functional_programming

fun main() {

}

fun factorial(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        var result = 1
        for (i in 1..n) {
            result *= i
        }
        result
    }
}

fun factorialRecursion(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        n * factorialRecursion(n - 1)
    }
}


tailrec fun factorialTailCallRecursion(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        factorialTailCallRecursion(n - 1, newResult)
    }

}