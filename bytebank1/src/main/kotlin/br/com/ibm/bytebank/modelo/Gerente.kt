package br.com.ibm.bytebank.modelo

import br.com.ibm.bytebank.modelo.Autenticavel
import br.com.ibm.bytebank.modelo.FuncionarioAdmin

class Gerente(
     nome: String,
     cpf: String,
     salario: Double,
     senha: Int

) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel {

     override val bonificacao: Double get() = bonificacao * 0.1 + salario

}