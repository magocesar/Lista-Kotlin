// 13. Crie uma função de ordem superior chamada operacaoMatematica que aceita dois números e uma função lambda.
// A função operacaoMatematica deve aplicar a função lambda aos dois números e retornar o resultado.
// Em seguida, crie algumas funções lambda para realizar operações matemáticas, como soma, subtração, multiplicação e divisão.
// Use a função de ordem superior para realizar essas operações com diferentes pares de números.
fun funcaoLambda(n1 : Int, n2 : Int, operacao : (Int, Int) -> Int) : Int{
    return operacao(n1, n1)
}

fun main(){
    val soma = funcaoLambda(2, 3, {a, b -> a + b})
    val subtracao = funcaoLambda(2, 3, {a, b -> a - b})
    val multiplicacao = funcaoLambda(2, 3, {a, b -> a * b})
    val divisao = funcaoLambda(2, 3, {a, b -> a / b})
    println("Soma: $soma, Subtração: $subtracao, Multiplicação: $multiplicacao, Divisão: $divisao")
}

