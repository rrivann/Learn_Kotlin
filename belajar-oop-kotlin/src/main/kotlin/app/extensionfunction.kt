package app

import data.Student
import data.sayHello
import data.upperName

fun main() {
    val student = Student("Rivan", 21)
    student.sayHello("Ayy", 20)
    println(student.upperName)

    student.upperName = "Albani"
    println(student.upperName)
}