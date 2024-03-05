// 5. Implemente uma função lambda que retorne o maior valor entre dois números.
val biggestNumber = {n1 : Int, n2 : Int -> if(n1 > n2) n1 else n2}

fun main() {
    println(biggestNumber(6, 7))
    println(biggestNumber(10, 5))
}