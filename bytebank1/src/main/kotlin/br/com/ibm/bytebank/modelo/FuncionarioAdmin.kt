package br.com.ibm.bytebank.modelo

import br.com.ibm.bytebank.modelo.Funcionario

//open permite que qualquer outra classe faca a heranca dessa classe
abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int

): Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    fun autentica(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }

}