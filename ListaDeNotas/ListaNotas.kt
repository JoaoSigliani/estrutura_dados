class ListaNotas(private val tamanho: Int = 10) : ListavelNotas {
    private var quantidade = 0
    private val elementos: Array<Aluno?> = arrayOfNulls(tamanho)
    private var ponteiroInicio = 0
    private var ponteiroFim = -1

    override fun inserir(nome: String, nota: Double, posicao: Int): Aluno? {
        //verifica se a lista está cheia
        if (quantidade == elementos.size) {
            println("A lista está cheia")
            return null
        }
        //verifica se o índice é válido
        if (posicao < 0 || posicao > quantidade) {
            println("Erro: Índice fora dos limites.")
            return null
        }
        //corpo real da função
        var posicaoFisica = (ponteiroInicio + posicao) % elementos.size
        var ponteiroAux = ponteiroFim+1
        for (i in posicao until quantidade) {
            var atual = ponteiroAux
            var anterior = ponteiroAux - 1
            if (ponteiroAux == elementos.size) {
                ponteiroAux = 0
            }
            elementos[atual] = elementos[anterior]
            ponteiroAux--
        }
        elementos[posicaoFisica] = Aluno(nome, nota)
        ponteiroFim++
        if (ponteiroFim == elementos.size) {
            ponteiroFim = 0
        }
        quantidade++
        return Aluno(nome, nota)
    }

    override fun remover(posicao: Int): Aluno? {
        //verifica se a lista está cheia
        if (quantidade == 0) {
            println("A lista está vazia")
            return null
        }
        //verifica se o indice é valido
        if (posicao < 0 || posicao > quantidade){
            println("Índice inválido")
            return null
        }
        var dadoAux: Any? = null
        var posicaoFisica = (ponteiroInicio + posicao) % elementos.size
        dadoAux = elementos[posicaoFisica]
        var ponteiroAux = posicaoFisica
        for (i in posicao until (quantidade-1)) {
            var atual = ponteiroAux
            var proximo = (ponteiroAux+1)%elementos.size
            elementos[atual] = elementos[proximo]
            ponteiroAux++
        }
        ponteiroFim--
        if (ponteiroFim == -1)
            ponteiroFim = elementos.size - 1
        quantidade--
        return dadoAux
    }

    override fun imprimir(): String {
        var resultado = "["
        var ponteiroAux = ponteiroInicio
        for (i in 0 until quantidade) {
            resultado += if (i == ponteiroFim)
                elementos[(ponteiroAux+i) % elementos.size]?.mostrar()
            else
                "${elementos[(ponteiroAux+i) % elementos.size]?.mostrar()}, "
        }
        return "$resultado]"
    }

    override fun mostrarMedia(): String {
        var ponteiroAux = ponteiroInicio
        var soma: Double = 0.0
        for (i in 0 until quantidade){
            soma += elementos[(ponteiroAux+i) % elementos.size]!!.getNota()
        }
        return "Média: ${soma/quantidade}"
    }
}