fun main() {
    var precoCoxinha = 5.00
    var precoCerveja = 15.00
    var quantidadeCoxinha = 3
    var quantidadeCerveja = 2
    var contaCoxinha = (precoCoxinha*quantidadeCoxinha)
    var contaCerveja = (precoCerveja*quantidadeCerveja)
    var somatoria = contaCoxinha+contaCerveja
    var taxa = (somatoria*0.1)
    var contafinal = (somatoria+taxa)

    println("------------------------------------------------")
    println("Lanchonete Kaue")
    println("------------------------------------------------")
    println("$quantidadeCoxinha Coxinha(s)   R$ $contaCoxinha")
    println("$quantidadeCerveja Cerveja(s)   R$ $contaCerveja")
    println("Somatoria     R$ $somatoria")
    println("Taxa 10%       R$ $taxa")
    println("------------------------------------------------")
    println("Conta final    R$ $contafinal")
}