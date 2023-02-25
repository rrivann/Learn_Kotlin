package object_oriented_programming

fun main() {
    val dicodingCat = AnimalFour("Miaw", 5.2, 2, true)
    println(dicodingCat.getAnimalInfo)
}

class AnimalFour(val name: String, var weight: Double, var age: Int, var isMammal: Boolean)

val AnimalFour.getAnimalInfo: String
    get() = "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age} Mamalia: ${this.isMammal}"