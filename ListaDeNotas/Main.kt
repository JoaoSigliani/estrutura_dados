fun main() {
    val pilha: ListavelNotas = ListaNotas()
    pilha.inserir("João Vitor", 8.0, 0)
    pilha.inserir("Freitas", 9.5, 1)
    pilha.inserir("Fulano", 9.0, 2)
    pilha.remover(1)
    pilha.inserir("Ciclano", 7.0, 1)
    println(pilha.mostrarMedia())

    println(pilha.imprimir())
}