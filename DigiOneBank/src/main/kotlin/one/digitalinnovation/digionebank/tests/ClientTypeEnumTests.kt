package one.digitalinnovation.digionebank.tests

import one.digitalinnovation.digionebank.ClientType

fun main(){
    ClientType.values().forEach {
        println("${it.name} - ${it.description}")
    }

    ClientType.values().forEach { client ->
        println("${client.name} - ${client.description}")
    }

    val pp = ClientType.PP
    println("${pp.name} - ${pp.description}")

    val lp = ClientType.LP
    println("${lp.name} - ${lp.description}")
}