package app

import data.BigNote
import data.Note

fun main() {
    val note = Note("Belajar kotlin")
    println(note.title)

    note.title = "as"
    println(note.title)

    val bigNote = BigNote("belajar kotlin")
    println(bigNote.title)
    println(bigNote.bigTitle)
}