package functional_programming

fun main() {
    val fullName = getFullName(first = "Kotlin", middle = " is ", last = "Awesome")
    print(fullName)
    val fullName2 = getFullName(middle = " is " , first = "Kotlin", last = "Awesome")
    print(fullName2)

    val fullName3 = getFullName2()
    print(fullName3)

}

fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}

fun getFullName2(
    first: String = "Kotlin",
    middle: String = " is ",
    last: String = "Awesome"): String {
    return "$first $middle $last"
}


