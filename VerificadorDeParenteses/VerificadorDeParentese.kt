fun verificaExpressao(exp: String): Boolean{
    //criação de pilha estática (embora dinâmica seria mais ideal):
    val pilha: EmpilhavelChar = PilhaChar(50)
    //for percorrendo todos os caracteres da expressão:
    for (i in exp){
        if(i == '(')
            pilha.empilhar(i) //insere os parênteses abertos no topo da pilha
        if(i == ')'){
            //retira o elemento do topo e verifica se é parêntese aberto:
            if (pilha.estaVazia() || pilha.desempilhar() != '(') {
                return false //se não houver parêntese aberto no topo da pilha, retorna falso
            }
        }
    }
    return pilha.estaVazia() //se a pilha estiver vazia, retorna verdadeiro
}

fun main() {
    val expressao1 = "(1 + (2 * 3))"
    val expressao2 = "(1 + 2) * (3 - 4))"
    val expressao3 = "(((1 + 2) * (3 - 4))"

    println("Expressão 1 : ${verificaExpressao(expressao1)}")  // true
    println("Expressão 2 : ${verificaExpressao(expressao2)}")  // false (parêntese fechado a mais)
    println("Expressão 3 : ${verificaExpressao(expressao3)}")  // false (parêntese aberto a mais)
}