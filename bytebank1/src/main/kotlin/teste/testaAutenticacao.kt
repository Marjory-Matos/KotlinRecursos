import modelo.Cliente
import modelo.Diretor
import modelo.Gerente
import modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Alex",
        cpf = "123456432",
        salario = 1234.0,
        senha = 1000
    )

    val diretor = Diretor(
        nome = "Diego",
        cpf = "0382239873",
        salario = 1230.0,
        senha = 1236,
        plr = 200.0
    )

    val cliente = Cliente(
        nome = "Diana",
        cpf = "83289391",
        senha = 1543
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretor, 1236)
    sistema.entra(cliente, 1543)



}