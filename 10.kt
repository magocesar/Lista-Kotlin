// 10. Crie uma classe "Triangulo" com os atributos "base" e "altura".
// Adicione um método chamado "area" que calcula e retorna a área do triângulo.
class Triangle(private val base: Double, private val height: Double){
    fun area() : Double{
        return (base * height) / 2
    }
}

fun main(){
    val triangle = Triangle(10.0, 5.0)
    println(triangle.area())
}