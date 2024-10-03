//classe de pilha de caracteres implementando a interface Empilhavel
class PilhaChar: EmpilhavelChar {
    private var ponteiroTopo: Int
    private var dados: Array<Char?>

    constructor(tamanho: Int) {
        dados = arrayOfNulls(tamanho)
        ponteiroTopo = -1
    }

    override fun empilhar(dado: Char?) {
        if (!estaCheia()) {
            ponteiroTopo++
            dados[ponteiroTopo] = dado
        } else {
            println("A pilha está cheia.")
        }
    }

    override fun desempilhar(): Char? {
        var dadoTopo: Char? = null
        if (!estaVazia()) {
            dadoTopo = dados[ponteiroTopo]
            ponteiroTopo--
        } else {
            println("A pilha está vazia.")
        }
        return dadoTopo
    }

    override fun estaVazia(): Boolean {
        return (ponteiroTopo == -1)
    }

    override fun estaCheia(): Boolean {
        return (ponteiroTopo == dados.size - 1)
    }

}