// 4. Crie uma função que receba uma string e retorne verdadeiro se a string for um palíndromo (ou seja, pode ser lida da mesma forma de trás para frente).
fun isPalindrome(string : String) : Boolean{
    val reversedString = string.reversed().lowercase()
    return string.lowercase() == reversedString
}