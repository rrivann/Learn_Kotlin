package object_oriented_programming

fun main() {
    val burung = Bird(1)
    burung.fly()
    flyWithWings(Bird(5))

    flyWithWings(object : IFly {
        override fun fly() {

            if (numberOfWings > 0)
                println("I Flying with $numberOfWings wings")
            else println("I flying without wings")
        }

        override val numberOfWings: Int
            get() = 2
    })
}

interface IFly {
    fun fly()
    val numberOfWings: Int

}

class Bird(override val numberOfWings: Int) : IFly {
    override fun fly() {
        if (numberOfWings > 0)
            println("I Flying with $numberOfWings wings")
        else println("I flying without wings")

    }
}


fun flyWithWings(bird: IFly) {
    bird.fly()
}
