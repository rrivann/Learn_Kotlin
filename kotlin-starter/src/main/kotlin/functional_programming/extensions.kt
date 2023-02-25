package functional_programming

fun main() {
    10.printInt()
    println(10.plusThree())

    println(10.slice)
}

fun Int.printInt() {
    println("value $this")
}

fun Int.plusThree(): Int {
    return this + 3
}

val Int.slice: Int
    get() = this / 2
