package functional_programming

fun main() {
    val message = buildString {
        append("Hello ")
        append("From ")
        append("Lambda ")
    }
    println(message)
}

fun buildString(action: StringBuilder.() -> Unit): String {
    val stringbuilder = StringBuilder()
    stringbuilder.action()
    return stringbuilder.toString()
}