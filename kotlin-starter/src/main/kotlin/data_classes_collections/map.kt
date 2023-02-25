package data_classes_collections

fun main() {
    val capital = mapOf(
        "Bandung" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )
    val mapKeys = capital.keys

    println(capital["Bandung"])
    println(capital.get("Bandung"))

    println(mapKeys)

    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")

    println(mutableCapital.values)
}