package br.com.ibm.bytebank.modelo

//temos que criar a classe no mesmo nivel de arquivo
//esses parametros sao do construtor, pois utilizamos ele ja na classe inicial
abstract class Conta(var titular: String, val numero: Int) {
    //var titular = ""
    //var numero = 0
    var saldo = 0.0
        //caso queremos que somente nos modificamos tal atributo colocamos o set como private
        protected set

    //construtor padrao usamos somente quando queremos modificar algo
   /* constructor(titular: String, numero: Int){
        this.titular = titular
        this.numero = numero
    } */


    fun deposita(valor: Double){
        if(valor > 0) {
            saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    //para indicar que queremos um retorno, por padrao ele nos retorna um Unit, mas como queremos um boolean indicamos ele
    fun transfere(valor: Double, destino: Conta): Boolean {
        if(saldo >= valor){
            saldo -= valor
            destino.deposita(valor)
            return true
        }
            return false
        }

    //get e set nao sao interessantes para o kotlin
    /*fun getSaldo(): Double{
        return saldo
    }

    fun setSaldo(valor: Double) {
        if (valor > 0) {
            saldo = valor
        }
    } */
}