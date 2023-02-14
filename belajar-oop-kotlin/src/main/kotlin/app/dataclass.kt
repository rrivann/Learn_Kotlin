package app

import data.Product

fun main() {
    val product1 = Product("Bayam",2000,"Sayuran")
    val product2 = product1.copy(name = "Kangkung")

    println(product1)
    println(product2)

}