package br.com.ibm.bytebank.modelo

import br.com.ibm.bytebank.modelo.Funcionario

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra (funcionario: Funcionario){
        this.total += funcionario.bonificacao
    }

}