package kotlin_fundamental

fun main() {
    val user = setUser("Rivan", 21)
    println(user)

    printUser("Rivan")
}

fun setUser(name: String, age: Int): String {
    return "Your name is $name, and you $age years old"
}

fun setUser2(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String) {
    print("Your name is $name")
}
