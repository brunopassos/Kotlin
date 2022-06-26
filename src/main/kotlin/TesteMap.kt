fun main(){
    val pair: Pair<String, Double> = Pair("João", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach { (t, u) ->  println("Chave: $t - Valor: $u")}


    val map2 = mapOf("Pedro" to 2500.0, "Maria" to 5000.0)

    println("-----------")
    map2.forEach { (t, u) -> println("Chave: $t - Valor: $u") }
}