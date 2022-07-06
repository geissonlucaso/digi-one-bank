package one.digitalinnovation.digionebank.reports

import one.digitalinnovation.digionebank.Employee

class ReportTools {
    companion object {
        fun printReportEmployee(employee: Employee) {
            println(
                employee.toString()
            )
        }
    }
}