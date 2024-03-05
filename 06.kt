// 6. Crie uma classe "ContaBancaria" com os atributos "saldo" e "limite".
// Adicione um método chamado "saque" que recebe um valor como parâmetro e subtrai do saldo da conta.
// Se o valor do saque for maior que o saldo da conta, o método deve lançar uma exceção com a mensagem "Saldo insuficiente".
class BankAccount(var balance: Double, var limit: Double){
    fun withdraw(value : Double){
        if(value > balance){
            throw Exception("Saldo insuficiente")
        }
        balance -= value
    }
}


fun main(){
    val account = BankAccount(100.0, 50.0)
    println(account.balance)
    //account.withdraw(150.0)
    account.withdraw(50.0)
    println(account.balance)
}