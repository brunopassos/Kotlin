fun main(){
    val joao = Funcionario("João", 3000.0, "CLT")
    val pedro = Funcionario("Pedro", 2000.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios = listOf(joao,pedro,maria)

    funcionarios.forEach { println(it) }
    println("---------------------")

    println(funcionarios.find{it.nome === "Maria"})
    println(funcionarios.find{it.salario === 2000.0})

    println("---------------------")
    funcionarios.sortedBy { it.nome }.forEach{println(it)}
    println("---------------------")
    funcionarios.groupBy { it.tipoContratacao }.forEach{println(it)}
}

data class Funcionario(
    val nome:String,
    val salario:Double,
    var tipoContratacao: String
){
    override fun toString(): String =
        """
            Nome: $nome
            Salario: $salario
        """.trimIndent()
}