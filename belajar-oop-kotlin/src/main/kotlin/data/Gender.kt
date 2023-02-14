package data

enum class Gender(private val description: String) {
    MALE("Male"), FEMALE("Female");


    fun showDescription(){
        println(description)
    }

}