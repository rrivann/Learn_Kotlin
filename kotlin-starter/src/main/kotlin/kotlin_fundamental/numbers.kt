package kotlin_fundamental

fun main() {
    val intNumber = 100
//    val longNumber: Long = 100
    val longNumber = 100L
    val shortNumber: Short = 10
    val byteNumber = 0b11010010
    val doubleNumber: Double = 1.3
    val floatNumber: Float = 0.123456789f //yang terbaca hanya 0.1234567

    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE

    println(maxInt)
    println(minInt)

    val overRangeInt = Int.MAX_VALUE + 1 // This operation has led to an overflow

    println("Max Int: $maxInt")
    println("Over range Int: $overRangeInt")

    val numberOne = 1
    val numberTwo = 2

    println(numberOne + numberTwo)

    println(numberOne / numberTwo)

    println(5 + 4 * 4)
    println((5 + 4) * 4)

    val byteNumber2: Byte = 10
    val intNumber2: Int = byteNumber.toInt()

    val stringNumber = "23"
    val intNumber3 = 3

    println(intNumber3 + stringNumber.toInt())


    val readableNumber = 1_000_000
    println(readableNumber)
}