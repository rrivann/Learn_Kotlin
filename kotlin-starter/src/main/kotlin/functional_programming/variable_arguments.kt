package functional_programming

fun main() {
    val number = sumNumbers(10, 20, 30, 40)
    println(number)

    val number2 = getNumberSize(10, 20, 30, 40, 50)
    println(number2)


    val number3 = asList(10, 20, 30, 40, 50)
    println(number3)
}

fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

fun <T> asList(vararg input: T): List<T> {
    val result = ArrayList<T>()
    for (item in input)
        result.add(item)
    return result
}

fun getNumberSize(vararg number: Int): Int {
    return number.size
}


