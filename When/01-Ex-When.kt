fun main(){
    println("Qual menu você quer acessar: 1, 2, 3 ou 4")
    val opcao = readLine()?.toIntOrNull()

    when (opcao){
        1 -> println("Você escolheu o menu 1 - Iphone ")
        2 -> println("Você escolheu o menu 2 - iPad ")
        3 -> println("Você escolheu o menu 3 - Mac ")
        4 -> println("Você escolheu o menu 4 - iMac ")
        else -> println("Opção Inválida!")
    }
    
}