import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaComportamentosConta() {
    //instancia da classe
    //nao conseguiremos imprimir dessa forma por isso teremos que a colocar dentro de uma variavel
    val contaAlex = ContaCorrente("Alex", 1000)
    //poderiamos indicar os parametros por labels, e elas nao precisam seguir a ordem do construtor:
    /* val contaAlex = modelo.Conta( numero = 1000, titular = "Alex") */
    /* contaAlex.titular = "Alex"
    contaAlex.numero = 1000 */
    contaAlex.deposita(200.0)
    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    val contaFran = ContaPoupanca("Fran", 1001)
    /* contaFran.titular = "Fran"
    contaFran.numero = 1001 */
    contaFran.deposita(300.0)
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("Depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("Depositando na conta da Fran")
    contaFran.deposita(60.0)
    println(contaFran.saldo)

    println("sacando na conta do Alex")
    contaAlex.saca(20.0)
    println(contaAlex.saldo)

    println("Sacando na conta da Fran")
    contaFran.saca(20.0)
    println(contaFran.saldo)

    println("Transferencia da conta da Fran para a conta do Alex")
    if (contaFran.transfere(100.0, contaAlex)) {
        println("Transferencia sucedida")
    } else {
        println("Falha na transferencia")
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}