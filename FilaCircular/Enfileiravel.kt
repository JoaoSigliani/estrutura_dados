interface Enfileiravel {
    fun enfileirar(dado: Any?)
    fun frente(): Any?
    fun atualizar(dado: Any?)
    fun desenfileirar(): Any?

    fun estaVazia(): Boolean
    fun estaCheia(): Boolean
    fun imprimir(): String
}