fun obterMnemonica(cor: Cor) =
    when(cor){
        Cor.VERMELHO -> "Ver"
        Cor.AMARELO -> "Alguém"
        Cor.VERDE -> "Viver"
        Cor.AZUL -> "Além é"
        Cor.LARANJA ->"Legal"
    }
fun obterTemperatura(cor:Cor): String{
    return when(cor){
        Cor.VERMELHO, Cor.LARANJA, Cor.AMARELO -> "Quente"
        Cor.VERDE -> "Neutro"
        Cor.AZUL -> "Frio"
    }
}


fun main(){
    val mnemonica = obterMnemonica(Cor.LARANJA)
    println(mnemonica)

    val temperatura = obterTemperatura(Cor.AZUL)
    println(temperatura)
}