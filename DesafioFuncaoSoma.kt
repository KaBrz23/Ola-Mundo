//Desafio Soma de Dois Quadrados
fun somaDosQuadrados(a: Int, b: Int): Int {
    val quadradoA = a*a

    val quadradoB = b*b

    return quadradoA + quadradoB
}

fun main() {
    val a=3
    val b=4
    val resultado = somaDosQuadrados(a, b)
    println("O resultado da soma dos quadrados de ${a} e ${b} é ${resultado}")
}
