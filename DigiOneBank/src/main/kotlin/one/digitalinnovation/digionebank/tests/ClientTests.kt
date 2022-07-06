package one.digitalinnovation.digionebank.tests

import one.digitalinnovation.digionebank.Client
import one.digitalinnovation.digionebank.ClientType

fun main() {
    val client = Client(
        name = "José",
        cpf = "147.852.369.85",
        clientType = ClientType.PP,
        password = "123456"
    )

    println(client)

    AuthentificationTest().authenticate(client)
}

