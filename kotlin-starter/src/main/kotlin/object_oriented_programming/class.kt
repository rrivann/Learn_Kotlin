package object_oriented_programming

class Animal(val name: String, val weight: Double, val age: Int, val isMammal: Boolean) {
    fun eat() {
        println("$name makan !")
    }

    fun sleep() {
        println("$name tidur !")
    }
}

fun main() {
    val cat = Animal("Kucing", 20.0, 4, false)
    println("Nama: ${cat.name}, Berat: ${cat.weight}")
    cat.eat()
    cat.sleep()
}