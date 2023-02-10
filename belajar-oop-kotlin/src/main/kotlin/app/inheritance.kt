package app

import data.Manager
import data.VicePresident

fun main() {
    val manager = Manager("Rivan")
    manager.sayHello("Ayy")

    val vicePresident = VicePresident("Albani")
    vicePresident.sayHello("Ray")

//    print(manager.name)
}