package data_classes_collections

fun main() {
    val dataUser = DataUser("Rivan", 21)
    val dataUser2 = DataUser("Rivan", 21)
    val dataUser3 = DataUser("Ray", 18)
    val dataUser4 = dataUser.copy()
    val dataUser5 = dataUser.copy(age = 20)

    val user = User("nrohmen", 17)
    val user2 = User("nrohmen", 17)
    val user3 = User("dimas", 24)

    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))

    println(user)
    println(dataUser)

    println(user.equals(user2))
    println(user.equals(user3))


    println(dataUser4)
    println(dataUser5)

}

class User(val name: String, val age: Int) {
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }

}

data class DataUser(val name: String, val age: Int) {
    fun intro() {
        println("My name is $name, I am $age years old")
    }
}
