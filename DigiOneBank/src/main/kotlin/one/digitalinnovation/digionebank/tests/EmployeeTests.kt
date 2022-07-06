package one.digitalinnovation.digionebank.tests

import one.digitalinnovation.digionebank.Employee
import one.digitalinnovation.digionebank.Person
import java.math.BigDecimal

fun main() {

    val name: String = "Geisson"
    val cpf: String = "123.456.789-12"

    val person = Person(name, cpf)
    println(person.info())

    val eName = "Geisson Oliveira"
    val eCpf: String = "123.456.789-12"
    val eSalarary: BigDecimal = BigDecimal.valueOf(1000.00)

    val employee = Employee(eName, eCpf, eSalarary)
    println(employee.info())                // Method from Person class.
}