//14. Crie uma função de extensão chamada isPalindromo para a classe String que verifica se a string é um palíndromo.
// A função deve ignorar espaços em branco e ser case-insensitive (não distinguir maiúsculas de minúsculas).
// Em seguida, use essa função para verificar se algumas palavras são palíndromos.

fun String.isPalindromo() : Boolean{
    val string = this.lowercase().replace(" ", "")
    return string == string.reversed()
}

fun main(){
    val string1 = "ovo"
    val string2 = "Ovo"
    val string3 = "O v o"
    val string4 = "O v O"
    val string5 = "O v O "
    val string6 = "O v O  "
    val string7 = "O v Oo  "
    println(string1.isPalindromo())
    println(string2.isPalindromo())
    println(string3.isPalindromo())
    println(string4.isPalindromo())
    println(string5.isPalindromo())
    println(string6.isPalindromo())
    println(string7.isPalindromo())
}

