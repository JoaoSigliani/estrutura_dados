class Aluno {
    private var nome: String
    private var nota: Double

    constructor(nm: String, nt: Double){
        nome = nm
        nota = nt
    }

    fun getNome(): String{
        return nome
    }

    fun getNota(): Double{
        return nota
    }

    fun mostrar(): String{
        return "$nome:$nota"
    }
}