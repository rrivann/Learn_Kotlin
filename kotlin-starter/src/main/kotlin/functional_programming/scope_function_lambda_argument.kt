package functional_programming

fun main() {
    val message: String? = "null"
    val length = message?.length ?: 0 * 2
    val text = "text length $length"
    println(text)

    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    } ?: run {
        val text = "message is null"
        println(text)
    }

    val text2 = "Hello Kotlin"
    val result = text2.also {
        println("value length -> ${it.length}")
    }
    println("text -> $result")
}