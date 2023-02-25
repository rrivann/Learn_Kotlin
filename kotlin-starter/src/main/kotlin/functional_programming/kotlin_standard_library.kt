package functional_programming

fun main() {
    println(buildString)
    val text = "Hello"
    text.let { value ->
        val message = "$value kotlin"
        println(message)
    }
}

val buildString= StringBuilder().apply {
    append("Hello ")
    append("Kotlin ")
}

