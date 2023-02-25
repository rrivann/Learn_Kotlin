package kotlin_generics



fun main() {
    val numbers = ListNumber<Long>()
    val numbers2 = ListNumber<Int>()
//    val numbers3 = ListNumber<String>()

    val numbers4 = listOf(1, 2, 3, 4, 5)
    numbers4.sumNumber()
    val names = listOf("R","V")
//    names.sumNumber()

}

class ListNumber<T : Number> : List<T> {
    override fun get(index: Int): T {
        TODO("Not yet implemented")
    }
}


fun <T : Number> kotlin.collections.List<T>.sumNumber(): T {

    return TODO("Provide the return value")
}