fun main(){
    val joao = Funcionario("João", 3000.0, "CLT")
    val pedro = Funcionario("Pedro", 2000.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    println("------LIST------")
    val funcionarios =  mutableListOf(joao,maria)
    funcionarios.forEach { println(it) }

    println("------------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("------------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("------SET------")
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach { println(it) }

    println("------------")
    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)
    funcionariosSet.forEach { println(it) }

    println("------------")
    funcionariosSet.remove(joao)
    funcionariosSet.forEach { println(it) }
}