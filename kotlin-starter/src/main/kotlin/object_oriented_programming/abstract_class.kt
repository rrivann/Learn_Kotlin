package object_oriented_programming

fun main() {
//    val animal = Animal("dicoding animal", 2.6, 1, true)
// ERROR
}

abstract class AnimalAbstract(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){

    fun eat(){
        println("$name sedang makan !")
    }

    fun sleep(){
        println("$name sedang tidur !")
    }
}
