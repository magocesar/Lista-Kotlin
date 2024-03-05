// 2. Crie uma função que receba um array de inteiros e retorne o maior número.
fun biggestNumberOfArray(Array : Array<Int>) : Int{
    var biggestNumber = Array[0]
    for(number in Array){
        if(number > biggestNumber){
            biggestNumber = number
        }
    }
    return biggestNumber
}