package one.digitalinnovation.digionebank

class Person {
    var name:String = "Geisson"
    var cpf:String = "123.456.789-12"
}

fun main(){
    val person = Person()

    println(person.name)
    println(person.cpf)
}