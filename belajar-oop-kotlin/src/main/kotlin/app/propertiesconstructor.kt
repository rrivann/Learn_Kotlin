package app

import data.User

fun main() {

    var user1 = User("Rivan", "RAHASIA")
    var user2 = User("Albani", "RAHASIA123")

    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)

}