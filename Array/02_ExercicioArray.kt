//Exercicio 2: Maior e menor elemento

fun main(){
    val numbers =  intArrayOf(8,3,12,6,20)
    var max = numbers[0] //variavel para armazenar o maior elemento
    var min = numbers[0] //variavel para armazenar o menor elemento

    //loop para encontrar o menor e o maior elemento

    for (number in numbers) {
        if (number < min) {
            min = number
        }
        if (number > max) {
            max = number
        }
    }
println("O menor elemento é: $min")
println("O menor elemento é: $max")
}