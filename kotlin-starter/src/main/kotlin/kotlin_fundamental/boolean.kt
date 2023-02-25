package kotlin_fundamental

fun main() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = now >= officeOpen && now <= officeClosed

    val isClose = now < officeOpen || now > officeClosed

    println("Office is open : $isOpen")

    println("Office is closed : $isClose")

    if (!isOpen) {
        println("Office is closed")
    } else {
        println("Office is open")
    }
}