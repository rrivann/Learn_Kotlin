package control_flow

fun main() {
    val colorRed: Color = Color.RED
    val colorGreen: Color = Color.GREEN
    val colorBlue: Color = Color.BLUE

    val colors: Array<Color> = Color.values()
    colors.forEach { color -> println("$color") }

    val color: Color = Color.valueOf("RED")
    println("Color is $color")
    println("Color value is ${color.value.toString(16)}")

    val colors2: Array<Color> = enumValues()
    colors2.forEach { color ->
        println(color)
    }

    val color2: Color = enumValueOf("RED")
    println("Color is $color2")

    print("Position GREEN is ${colorGreen.ordinal}")

    when(color){
        Color.RED -> print("Color is Red")
        Color.BLUE -> print("Color is Blue")
        Color.GREEN -> print("Color is Green")
    }
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class Color2 {
    RED, GREEN, BLUE
}


