package kotlin_fundamental

fun main() {
    val openHours = 7
    val now = 20
    if (now > openHours){
        println("office already open")
    }

    val office: String = if (now > 7) {
        "Office already open"
    } else if (now == openHours){
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }


    print(office)


}