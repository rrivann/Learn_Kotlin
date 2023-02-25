package kotlin_fundamental

fun main() {
    val text: String? = null
    text?.length

    val text2:String? = null
    val textLength = text?.length ?: 7
    val textLength2 = text!!.length
}