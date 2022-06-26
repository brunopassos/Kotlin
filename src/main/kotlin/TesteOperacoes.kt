fun main(){
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)
    for (salario in salarios){
        println(salario)
    }

    println("----------------")

    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor ssalario: ${salarios.minOrNull()}")
    println("Média dos salarios: ${salarios.average()}")
    val salaiosMaiorQue2500 = salarios.filter{it > 2500}
    salaiosMaiorQue2500.forEach { println(it) }

    println("----------------")

    println(salarios.find{it == 2250.0})
    println(salarios.find{it == 220.0})

    println("----------------")

    println(salarios.any{it == 1000.0})
    println(salarios.any{it == 1010.0})
}