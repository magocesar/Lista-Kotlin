// 8. Crie uma classe "Funcionario" com os atributos "nome", "idade" e "salario".
// Crie uma função que receba uma lista de funcionários e retorne o funcionário com o maior salário.
class Employee(private val name : String, private val age : Int, private val salary : Double){
    fun print(){
        println("Name: $name, Age: $age, Salary: $salary")
    }

    fun getSalary() : Double{
        return salary
    }
}

fun biggestSalary(employeeList : List<Employee>) : Employee{
    var biggestSalary = employeeList[0]
    for(employee in employeeList){
        if(employee.getSalary() > biggestSalary.getSalary()){
            biggestSalary = employee
        }
    }
    return biggestSalary
}

fun main(){
    val employees = listOf(
        Employee("Rodrigo", 25, 1000.0),
        Employee("Mark", 30, 2000.0),
        Employee("César", 20, 500.0)
    )
    val biggest = biggestSalary(employees)
    biggest.print()
}

