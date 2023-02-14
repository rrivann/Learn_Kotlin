package data

open class Teacher(val name: String) {
    private fun teach() {
        println("Teach!")
    }

    open fun test() {
        println("Test")
    }
}

class SuperTeacher(name: String) : Teacher(name) {
    override fun test() {
        super.test()
    }
}