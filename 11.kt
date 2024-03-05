// 11. Crie uma função que receba uma lista de strings e retorne uma
// lista com todas as strings que começam com a letra "A", em ordem alfabética.
fun startsWithA(list : List<String>) : List<String>{
    val newList = mutableListOf<String>()
    for(string in list){
        if(string[0] == 'A' || string[0] == 'a'){
            newList.add(string)
        }
    }
    return newList.sorted()
}

fun main(){
    val strings = listOf("Apple", "Banana", "Avocado", "Orange", "Grape")
    val newStrings = startsWithA(strings)
    println(newStrings)
}