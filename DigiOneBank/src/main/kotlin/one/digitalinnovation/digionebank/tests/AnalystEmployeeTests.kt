package one.digitalinnovation.digionebank.tests

import one.digitalinnovation.digionebank.Analyst
import one.digitalinnovation.digionebank.reports.ReportTools

fun main() {
    var analyst = Analyst("Geisson", "123.456.789-12", 1000.0)
    ReportTools.printReportEmployee(analyst)

}