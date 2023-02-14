package app

import data.Human

fun main() {
    val human = Human("Rivan")
//    println(human.name)
    human.sayHello("Budi")
    human.go()
    human.move()
}