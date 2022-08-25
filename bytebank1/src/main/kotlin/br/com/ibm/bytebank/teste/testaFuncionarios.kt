import br.com.ibm.bytebank.modelo.Analista
import br.com.ibm.bytebank.modelo.CalculadoraBonificacao
import br.com.ibm.bytebank.modelo.Diretor
import br.com.ibm.bytebank.modelo.Gerente

fun testaFuncionarios() {
    val alex = Analista(
        nome = "Alex",
        cpf = "123456789",
        salario = 1230.0
    )
    println("Nome ${alex.nome} CPF ${alex.cpf} Salario ${alex.salario} ")
    println("Bonificacao ${alex.bonificacao}")

    val fran = Gerente(
        nome = "Fran",
        cpf = "321654987",
        salario = 4215.0,
        senha = 1234
    )

    println("Nome ${fran.nome} CPF ${fran.cpf} Salario ${fran.salario}")
    println("Bonificacao ${fran.bonificacao}")

    if (fran.autentica(1234)) {
        println("Autenticou com sucesso")
    } else {
        println("Falha na autenticacao")
    }

    val gui = Diretor(
        nome = "Gui",
        cpf = "123987345",
        salario = 6215.0,
        senha = 1235,
        plr = 200.0
    )

    println("nome ${gui.nome} cpf ${gui.cpf} salario ${gui.salario} bonificacao ${gui.bonificacao}")

    val maria = Analista(
        nome = "Maria",
        cpf = "123654444",
        salario = 1000.0
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)
    println("O total de bonificacao: ${calculadora.total}")
}