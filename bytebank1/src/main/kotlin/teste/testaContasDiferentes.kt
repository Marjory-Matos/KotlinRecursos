import modelo.Conta
import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente: Conta = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )

    val contaPoupanca: Conta = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )

    contaPoupanca.deposita(1000.0)
    contaCorrente.deposita(1000.0)

    println("Saldo conta corrente ${contaCorrente.saldo}")
    println("Saldo conta poupanca ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)


    println("Saldo conta corrente ${contaCorrente.saldo}")
    println("Saldo conta poupanca ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.00, contaPoupanca)
    println("Saldo apos transferencia ${contaCorrente.saldo}")
    println("Saldo apos transferencia ${contaPoupanca.saldo}")
}