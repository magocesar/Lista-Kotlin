// 7. Crie uma função que receba uma lista de strings e retorne a string mais longa da lista.
fun longestString(list : List<String>) : String{
    var longest = list[0]
    for (i in list){
        if (i.length > longest.length){
            longest = i
        }
    }
    return longest
}

fun main() {
    val list = listOf("a", "ab", "abc", "abcd", "abcde")
    println(longestString(list))
}