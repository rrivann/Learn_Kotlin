package object_oriented_programming

fun main() {
    val dicodingCat = CatTwo("Dicoding Miaw", 3.2, 2, true, "Brown", 4)

    dicodingCat.playWithHuman()
    dicodingCat.eat()
    dicodingCat.sleep()
}

open class AnimalEleven(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean) {

    open fun eat() {
        println("$name sedang makan!")
    }

    open fun sleep() {
        println("$name sedang tidur!")
    }
}

class CatTwo(
    name: String,
    weight: Double,
    age: Int,
    isCarnivore: Boolean,
    val furColor: String,
    val numberOfFeet: Int
) : AnimalEleven(name, weight, age, isCarnivore) {
    fun playWithHuman() {
        println("$name bermain bersama Manusia !")
    }

    override fun eat() {
        println("$name sedang memakan ikan !")
    }

    override fun sleep() {
        println("$name sedang tidur di bantal !")
    }

}
