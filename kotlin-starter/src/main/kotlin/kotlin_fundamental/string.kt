package kotlin_fundamental

fun main() {
    val text = "Kotlin"
    val firstChar = text[0]

    println("First character of $text is $firstChar")

    for (char in text) {
        print("$char ")
    }

//    Escaped String
    val statement = "\nKotlin is \"Awesome!\""
    println(statement)

    val name = "Unicode test: \u00A9"
    println(name)

//    Raw String
//    val line = "Line 1\n" +
//            "Line 2\n" +
//            "Line 3\n" +
//            "Line 4\n"

    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    println(line)

    val name2 = "Kotlin"
    val old = 3
    val hour = 7

    println("My name is " + name2)
    println("My name is $name2")
    println("My name is $name, im $old years old")
    println("Office ${if (hour > 7) "already close" else "is open"} ")

}