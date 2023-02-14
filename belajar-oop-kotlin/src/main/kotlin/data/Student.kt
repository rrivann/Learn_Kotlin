package data

class Student(var name: String, val age: Int)

fun Student?.sayHello(name: String, age: Int) {
    if (this != null)
        println("Hello $name, my name is ${this.name}, and my age is ${this.age}")
}

var Student.upperName: String
    get() = this.name.uppercase()
    set(value) {
        this.name = value
    }
