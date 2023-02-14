package app

import data.Token

fun main() {
    val token = Token("Init token")

    println(token.value)
    println(token.toUpper())
}