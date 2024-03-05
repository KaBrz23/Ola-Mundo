//exercicio - maior  ou menor de idade

// fun main(){
//     val idade = 19

//     if(idade >=18){
//         println("Maior de idade, já pode dirigir")

//     } else {
//         println("Menor de idade, não pode dirigir")
//     }
// }


//=====================Recebendo parametros do usuario ==========================//

fun main(){
    println("Digite a sua idade: ")
    var idadeInput = readLine() // lê a entrada do usuario como uma string
    
    //verificar se a entrada da idade é nula
    if(idadeInput == null){
        println("Entrada inválida")
        return // sai da função main se a entrada for nula
    }

    // tenta converter a entrada de idade para um número numérico
    val idade = idadeInput.toIntOrNull()

    //verificar se a conversão foi sucesso ou se a entrada é inválida
    if(idade == null){
        println("Entrada inválida! Entrada Vazia")
        return// sai da função main se a entrada for nula
    }

    //Verificar se a idade é maior ou igual a 18
    if (idade >= 18){
        println("Você é maior de idade")
    } else {
        println("Você é menor de idade")
    }
}