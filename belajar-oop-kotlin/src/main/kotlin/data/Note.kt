package data

import java.util.*

class Note(title: String) {
    var title: String = title
        get() {
            println("Call getter")
            return field
        }
        set(value) {
            println("Call setter")
            if (value.isNotBlank()) {
                field = value
            }
        }
}

class BigNote(val title: String){
    val bigTitle:String
        get() = title.uppercase()
}