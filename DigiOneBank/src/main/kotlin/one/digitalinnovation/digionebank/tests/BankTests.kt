package one.digitalinnovation.digionebank.tests

import one.digitalinnovation.digionebank.Bank

fun main() {
    val digiOneBank = Bank(name = "DigiOne", number = 12)
    println(digiOneBank.info())

    val bank2 = digiOneBank.copy(name = "Bank2", number = 13)
    println(bank2.info())
}