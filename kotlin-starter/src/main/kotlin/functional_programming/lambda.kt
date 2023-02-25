package functional_programming

fun main() {
    message()
    printMessage("Hello From Lambda")
    val length = messageLength("Hello from lambda")
    println("Message length $length")
}

val message = { println("Hello from Lambda") }

val comparator = Runnable { }

val printMessage = { message: String -> println(message) }

val messageLength = { message: String -> message.length }