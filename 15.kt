//15. Vamos criar um programa que utilize funções de alta ordem para operar em um array de números inteiros.
// Você deve criar funções de alta ordem para realizar as seguintes operações:
// filtrarPares: Uma função que filtra e retorna apenas os números pares do array;
// dobrarValores: Uma função que dobra o valor de cada número no array;
// somarValores: Uma função que calcula a soma de todos os valores no array.
// Em seguida, crie um array de números inteiros e utilize as funções de alta ordem para realizar essas operações.

fun filtrarPares(array : Array<Int>) : Array<Int>{
    return array.filter { it % 2 == 0 }.toTypedArray()
}

fun dobrarValores(array : Array<Int>) : Array<Int>{
    return array.map { it * 2 }.toTypedArray()
}

fun somarValores(array : Array<Int>) : Int{
    return array.reduce { acc, i -> acc + i }
}

fun operacaoMatematica(array : Array<Int>, operacao : (Array<Int>) -> Array<Int>) : Array<Int>{
    return operacao(array)
}

fun main(){
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val pares = operacaoMatematica(array, ::filtrarPares)
    val dobrados = operacaoMatematica(array, ::dobrarValores)
    val soma = somarValores(array)
    println("Pares: ${pares.joinToString()}, Dobrados: ${dobrados.joinToString()}, Soma: $soma")
}

