package object_oriented_programming

class AnimalEight(
    private var name: String,
    private val weight: Double,
    private val age: Int,
) {
    fun getName(): String {
        return name
    }
    fun setName(newName: String) {
        name = newName
    }
}

fun main() {
    val dicodingCat = AnimalEight("Dicoding Miaw", 2.5, 2)
    println(dicodingCat.getName())
    dicodingCat.setName("Gooose")
    println(dicodingCat.getName())

    val cat = Cat("Dicoding Miaw", 2.0)
    println("Nama Kucing: ${cat.name}")
//    println("Berat Kucing: ${cat.weight}")  //Cannot access 'weight': it is protected in 'Cat'

}


open class AnimalNine(val name: String, protected val weight: Double)

class Cat(pName: String, pWeight: Double) : AnimalNine(pName, pWeight)


internal class AnimalTen(val name: String)
