package control_flow

fun main() {
    val openOffice = 7
    val now = 8
    if (now > openOffice)
        println("Office already open")
    else
        println("Office close")

    val office = if (now > openOffice) "Office already open" else "Office close"
    println(office)

    val result = sum(1, 1 * 5)
    println(result)
}

fun sum(value1: Int, value2: Int): Int = value1 + value2