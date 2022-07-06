package one.digitalinnovation.digionebank.tests

import one.digitalinnovation.digionebank.Manager
import one.digitalinnovation.digionebank.reports.ReportTools

fun main() {
    var manager = Manager("Geisson", "123.456.789-12", 1000.0)
    ReportTools.printReportEmployee(manager)

}