package data

open class Shape {
    open val corner: Int = -1
    open fun printName() {
        println("This Is Shape")
    }
}

class Rectangle : Shape() {
    override val corner: Int = 3
    val parentCorner: Int = super.corner
    override fun printName() {
        super.printName()
        println("This is Rectangle")
    }

}

open class Triangle : Shape() {
    override val corner: Int = 4
}