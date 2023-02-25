package object_oriented_programming

fun main() {
    val dicodingCat = AnimalFive("Dicoding Miaw", 4.2, isMammal = false)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
}

class AnimalFive(var name: String, var weight: Double, var age: Int = 0, var isMammal: Boolean = true)

class AnimalSix(name: String, weight: Double, age: Int, isMammal: Boolean) {
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0  else age
        this.name = name
        this.isMammal = isMammal
    }
}

