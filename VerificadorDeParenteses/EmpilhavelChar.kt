//interface contendo apenas os métodos necessários para a realização do programa
interface EmpilhavelChar {
    fun empilhar(dado: Char?)
    fun desempilhar(): Char?
    fun estaVazia(): Boolean
    fun estaCheia(): Boolean
}