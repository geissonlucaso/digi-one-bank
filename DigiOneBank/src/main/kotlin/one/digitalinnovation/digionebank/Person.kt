package one.digitalinnovation.digionebank

open class Person(
    open val name: String,
    open val cpf: String
) {
    fun info() = "${name} - ${cpf}"
}
