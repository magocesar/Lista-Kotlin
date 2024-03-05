// 3. Crie uma classe chamada "Pessoa" com os atributos "nome" e "idade".Em seguida, crie uma lista de objetos "Pessoa" e ordene a lista em ordem alfabética pelo atributo "nome".
class Person(private val name : String, private val age : Int){
    fun print(){
        println("Name: $name, Age: $age")
    }

    fun getName() : String{
        return name
    }
}

fun main(){
    var people = listOf(
        Person("Rodrigo", 25),
        Person("Mark", 30),
        Person("César", 20)
    )
    people = people.sortedBy { it.getName() }
    for(person in people){
        person.print()
    }


}