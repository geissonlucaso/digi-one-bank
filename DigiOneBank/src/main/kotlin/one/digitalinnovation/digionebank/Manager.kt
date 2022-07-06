package one.digitalinnovation.digionebank

class Manager(
    name: String,
    cpf: String,
    salary: Double
) : Employee(name = name, cpf = cpf, salary = salary) {

    override fun calculateAid(): Double = salary * 0.4
}