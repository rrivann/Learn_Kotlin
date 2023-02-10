package app

import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Rivan")
    val premiumCustomer2 = PremiumCustomer("Albani", 200200)

    println(premiumCustomer.type)
    println(premiumCustomer2.name)
    println(premiumCustomer2.balance)

    val executiveCustomer = ExecutiveCustomer("Rivan", 100000)

    println(executiveCustomer.name)
    println(executiveCustomer.type)
}