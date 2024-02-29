//Exercício 4: Buscando elementos do Array

fun main(){
    //Array de Strings
    val names = arrayOf("Mariana", "Betriz", "Kauê", "Lucas")
    val searchName = "Kauê" //elemento a ser buscado
    var found = false //Variavel para verificar se o elemento foi encontrado

    //Loop para verificar se o elemento está presente
    for (name in names){
        if(name == searchName){
            found = true
            break
        }
    }

    if (found){
        println("$searchName foi encontrado no array.")
    } else {
        println("$searchName não foi encontrado no array")
    }
}