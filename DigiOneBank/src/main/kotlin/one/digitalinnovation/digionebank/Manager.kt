package one.digitalinnovation.digionebank

import one.digitalinnovation.digionebank.interfaces.Login

class Manager(
    name: String,
    cpf: String,
    salary: Double,
    val password: String
) : Employee(name = name, cpf = cpf, salary = salary), Login {

    override fun calculateAid(): Double = salary * 0.4

    override fun login(): Boolean = "pw123" == password
}