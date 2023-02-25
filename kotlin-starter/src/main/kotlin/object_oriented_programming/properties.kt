package object_oriented_programming

fun main() {
    val dicodingCat = AnimalTwo()
    println("Nama: ${dicodingCat.name}")
    dicodingCat.name = "Goose"
    println("Nama: ${dicodingCat.name}")
}

class AnimalTwo {
    var name: String = "Dicoding Miaw"
        get() {
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value) {
            println("Fungsi Setter Terpanggil")
            field = value
        }
}