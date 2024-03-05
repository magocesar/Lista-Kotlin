// 9. Crie uma função que receba uma lista de números inteiros e retorne uma lista com os números em ordem crescente,
// sem usar o método de ordenação da linguagem.
fun bubbleSort(array : MutableList<Int>) : MutableList<Int>{
    val n = array.size
    for(i in 0 until n){
        for(j in 0 until n - 1){
            if(array[j] > array[j + 1]){
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
    return array
}

fun main(){
    val numbers = mutableListOf(3, 2, 1, 5, 4)
    val sortedNumbers = bubbleSort(numbers)
    println(sortedNumbers)
}