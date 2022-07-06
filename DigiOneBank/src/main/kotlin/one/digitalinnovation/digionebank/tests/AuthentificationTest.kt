package one.digitalinnovation.digionebank.tests

import one.digitalinnovation.digionebank.interfaces.Login

class AuthentificationTest {
    fun authenticate(login: Login) = println(login.login())
}