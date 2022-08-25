import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaCopiaEReferencias() {

    //quando informamos que uma variavel recebe outra, estamos realizando uma copia dela
    val numeroX = 10
    var numeroY = numeroX
    numeroY++
    println(numeroX)
    println(numeroY)

    //quando fazemos isso com uma classe ele nao cria uma copia e sim instancia ela e por isso o valor sera alterado nas duas
    val contaJoao = ContaCorrente("Joao", 1002)
    /* contaJoao.titular = "Joao" */
    var contaMaria = ContaPoupanca("Maria", 1003)
    /* contaMaria.titular = "Maria" */
    println(contaJoao.titular)
    println(contaMaria.titular)


}