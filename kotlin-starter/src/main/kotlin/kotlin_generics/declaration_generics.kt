package kotlin_generics

fun main() {
    val numbers = (1..100).toList()
    println(numbers.slice(1..10))
}

fun <T> run():T{
    return TODO("Provide the return value")
}