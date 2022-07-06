package one.digitalinnovation.digionebank

class Analyst(
    name: String,
    cpf: String,
    salary: Double
) : Employee(name = name, cpf = cpf, salary = salary) {

    override fun calculateAid() = salary * 0.10 // Percentage.
}