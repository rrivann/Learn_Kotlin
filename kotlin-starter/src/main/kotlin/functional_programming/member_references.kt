package functional_programming

fun count(valueA: Int, valueB: Int): Int {
    return valueA + valueB
}

//fun isEvenNumber(number: Int) = number % 2 == 0
fun Int.isEvenNumber() = this % 2 == 0

var message5 = "Kotlin"
fun main() {
    val sum: (Int, Int) -> Int = ::count

    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(Int::isEvenNumber)

    println(evenNumbers)



    println(::message5.name)
    println(::message5.get())

    ::message5.set("Kotlin Academy")
    println(::message5.get())
}