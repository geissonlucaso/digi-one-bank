package one.digitalinnovation.digionebank

abstract class Employee(
    name: String,
    cpf: String,
    val salary: Double
) : Person(name = name, cpf = cpf) {
    protected abstract fun calculateAid(): Double

    override fun toString(): String = "" +
            "Name: $name - " +
            "Cpf: $cpf - " +
            "Salary: $salary - " +
            "Aid: ${calculateAid()}".trimIndent()
}