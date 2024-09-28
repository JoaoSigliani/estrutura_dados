fun main() {
    val fila: Enfileiravel = FilaEstaticaCircular(4)
    fila.enfileirar("A");
    fila.enfileirar("B")
    println("Frente: ${fila.frente()}")
    fila.enfileirar("C")
    fila.enfileirar("D")
    fila.enfileirar("E")
    val conteudo = fila.desenfileirar()
    println("Frente: ${fila.frente()}")
    fila.enfileirar("E")
    fila.desenfileirar()
    fila.enfileirar(conteudo)
    println("Fila=${fila.imprimir()}")
    println(conteudo)
}