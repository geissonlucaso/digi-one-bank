package one.digitalinnovation.digionebank

class Person {
    var name:String = "Geisson"

    var cpf:String = "123.456.789-12"
    private set

    constructor()       // secundary constructor.

    fun personInfo() = "$name, $cpf"
}
