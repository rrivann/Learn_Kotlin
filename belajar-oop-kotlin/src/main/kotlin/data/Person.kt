package data

class Person {
    var firstName: String = ""
    var midleName: String? = null
    var lastName: String = ""

    fun sayHello(firstname: String) {
        println("Hello $firstname, My Name is ${this.firstName}")
    }

    fun sayHello(firstName: String, lastName: String) {
        println("Hello $firstName $lastName, My Name is ${this.firstName}")
    }

    fun run() {
        println("I'am Run")
    }

    fun getFullName(): String {
        return "$firstName $midleName $lastName"
    }
}