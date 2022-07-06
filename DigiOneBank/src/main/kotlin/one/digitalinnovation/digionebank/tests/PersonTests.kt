package one.digitalinnovation.digionebank.tests

import one.digitalinnovation.digionebank.Person

fun main() {

    val name: String = "Geisson"
    val cpf: String = "123.456.789-12"

    val person = Person(name, cpf)
    println(person.info())
}
