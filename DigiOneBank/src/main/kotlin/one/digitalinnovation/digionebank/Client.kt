package one.digitalinnovation.digionebank

import one.digitalinnovation.digionebank.interfaces.Login

class Client(
    name: String,
    cpf: String,
    val clientType: ClientType,
    val password: String
) : Person(name, cpf), Login {

    override fun login(): Boolean = "123456" == password

    override fun toString(): String = "" +
            "Name: $name - " +
            "Cpf: $cpf - " +
            "Client type: ${clientType.description}".trimIndent()
}