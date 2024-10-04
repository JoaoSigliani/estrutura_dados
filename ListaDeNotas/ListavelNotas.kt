interface ListavelNotas {
    fun inserir(nome: String, nota: Double, posicao: Int): Aluno?
    fun remover(posicao: Int): Aluno?
    fun imprimir(): String
    fun mostrarMedia(): String

}