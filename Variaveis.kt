// Exemplo de variável em Kotlin

// fun main() {
//     val nome = "Kauê" // Variavel tipo String // pode ser alterada
//     var idade = 18 // Variavel do tipo inteira // pode ser alterada

//     println("Nome: $nome, Idade: $idade") // imprimindo o conteúdo da variável no console
// }

//Declaração e Inicialização de Variáveis
//Int, Double, String, Boolean - Mais utilizadas

// fun main () {
//     val numeroInteiro: Int = 10
//     var numeroDecimal: Double = 3.14
//     val texto: String = "Olá Mundo!"
//     var status: Boolean = true //se true o status é on-line se falso status é off-line (0 ou 1)

//     println("NúmeroInteiro: $numeroInteiro")
//     println("NúmeroDecimal: $numeroDecimal")
//     println("Texto: $texto")
//     println("Status: $status")


// }

//Variaveis com tipo de dados
//Char, Byte, Short, Long

// fun main(){
//     val numeroInteiro: Int = 10
//     val numeroLong: Long = 100000000
//     val numeroDecimal: Double = 211.14
//     val caractere: Char = 'K'
//     val texto: String = "Kotlin também serve para back end"
//     val verdadeiro: Boolean = true

//     println("Inteiro: $numeroInteiro")
//     println("Long: $numeroLong")
//     println("Decimal: $numeroDecimal")
//     println("Caracter: $caractere")
//     println("Texto: $texto")
//     println("Verdadeiro: $verdadeiro")
// }

//multabilidade e imultabilidade no contexto de var e val

fun main() {
    val imutavel: Int = 5 //imutavel
    var mutavel: Int = 10 //mutavel

    mutavel = 15
    //imutavel = 20 //ERRO! Não pode atribuir um valor a uma variável declarada como imutável
    println("Imutável: $imutavel")
    println("Mutável: $mutavel")
}