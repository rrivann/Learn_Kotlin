package data_classes_collections

fun main() {
    val dataUser = DataUser("nrohmen", 17)
    val (name, age) = dataUser

    println("My name is $name, I am $age years old")
    dataUser.intro()
}


