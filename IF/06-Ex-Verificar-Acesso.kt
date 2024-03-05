//Exercício de verificação de acesso

fun main(){
    println("Digite o usuário: ")
    val usuarioInput = readLine()

    println("Digite a senha: ")
    val senhaInput = readLine()
    // verificando se o usuário é valido

    val usuario = "kaue"
    val senha = "123"
    
    if(usuario == usuarioInput && senha == senhaInput){
        println("Acesso permitido!")
    }else{
        println("Usuário ou senha inválidos!")
    }
}