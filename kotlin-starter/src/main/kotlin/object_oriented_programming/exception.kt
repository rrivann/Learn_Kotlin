package object_oriented_programming

fun main() {
//    val someValue = 6
//    println(someValue / 0)

//    val someStringValue = "18.0"
//    println(someStringValue.toInt())

    val someNullValue: String? = null
    val someMustNotNullValue: String = someNullValue!!
    println(someMustNotNullValue)

}