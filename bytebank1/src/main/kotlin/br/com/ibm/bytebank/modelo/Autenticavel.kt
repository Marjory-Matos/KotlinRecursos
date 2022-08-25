package br.com.ibm.bytebank.modelo

interface Autenticavel {

    fun autentica(senha: Int): Boolean
}