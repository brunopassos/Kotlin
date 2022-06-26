fun main(){
    val joao = Funcionario("João", 3000.0, "CLT")
    val pedro = Funcionario("Pedro", 2000.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios1 = setOf(joao,maria)
    val funcionarios2 = setOf(pedro)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{println(it)}

    println("-------------")


    val funcionarios3 = setOf(maria, joao, pedro)

    val resultSubtract = funcionarios3.subtract(funcionarios1)
    resultSubtract.forEach{println(it)}

    println("-------------")


    val resultIntersect = funcionarios3.intersect(funcionarios1)
    resultIntersect.forEach{println(it)}

}


