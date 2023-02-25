package functional_programming

fun main() {
    val text = "Hello"
    val result = text.run {
        val from = this
        val to = this.replace(from, "Kotlin")
        "replace text from $from to $to"
    }
    println("result : $result")

    val message = "Hello Kotlin"
    val result2 = with(message) {
        println("value is $this")
        println("with length ${this.length}")
    }
    val result3 = with(message) {
        "First character is ${this[0]}" + " and last character is ${this[this.length - 1]}"
    }
    println(result3)

    val message2 = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(message2.toString())


}