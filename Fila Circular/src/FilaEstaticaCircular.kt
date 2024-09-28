class FilaEstaticaCircular: Enfileiravel {
    private var ponteiroInicio = 0
    private var ponteiroFim = 0
    private var dados: Array<Any?>

    constructor(tamanho: Int){
        dados = arrayOfNulls(tamanho)
    }

    override fun enfileirar(dado: Any?){
        if(!estaCheia()){
            dados[ponteiroFim % dados.size] = dado
            ponteiroFim++
        } else{
            println("A fila está cheia!")
        }
    }

    override fun frente(): Any?{
        var dadoFrente: Any? = null
        if(!estaVazia()){
            dadoFrente = dados[ponteiroInicio]
        } else{
            println("A fila está vazia!")
        }
        return dadoFrente
    }

    override fun atualizar(dado: Any?){
        if(!estaVazia()){
            dados[ponteiroInicio] = dado
        } else{
            println("A fila está vazia!")
        }
    }

    override fun desenfileirar(): Any?{
        var dadoFrente: Any? = null
        if(!estaVazia()){
            dadoFrente = dados[ponteiroInicio % dados.size]
            ponteiroInicio++
        } else{
            println("A fila está vazia!")
        }
        return dadoFrente
    }

    override fun estaVazia(): Boolean{
        return ponteiroInicio == ponteiroFim
    }

    override fun estaCheia(): Boolean{
        return ponteiroFim - ponteiroInicio == dados.size
    }

    override fun imprimir(): String{
        var impressao = "["
        for(i in ponteiroInicio until ponteiroFim){
            if(i == ponteiroFim - 1){
                impressao += "${dados[i % dados.size]}"
            }else{
                impressao += "${dados[i % dados.size]}, "
            }
        }
        return "$impressao]"
    }
}