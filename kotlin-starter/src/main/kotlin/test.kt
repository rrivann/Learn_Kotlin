import kotlin_generics.ListNumber

enum class Rainbow(val color : String) {
    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    INDIGO("Indigo"),
    VIOLET("Violet")
}


fun main() {
//    println(Rainbow.valueOf("RED"))
//    val anyList = listOf('a', "Kotlin", 3, true)
//    println(anyList[4])

    val numbers = ListNumber<Long>()
    val numbers2 = ListNumber<Int>()
    val numbers3 = ListNumber<String>()


    println("Values: " + numbers)
    println("Values: " + numbers)
    println("Values: " + numbers)
}
