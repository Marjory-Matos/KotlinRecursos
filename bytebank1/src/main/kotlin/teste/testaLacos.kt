fun testaLacos(){
    var i = 0
    while(i < 5) {
        val titular = "Alex $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("Titular $titular")
        println("Numero da conta $numeroConta")
        println("Saldo da conta $saldo")
        println()
        i++
    }

    /*
      for (i in 1..3) {

         //val variavel que nao permite modificar o valor
         //var varival que permite modificar o valor
         //deve sempre inicializar a variavel
         val titular = "Alex $i"
         val numeroConta = 1000 + i
         var saldo = i + 10.0


         //podemos utilizar a string templete que eh chamar a variavel dentro da string
         println("Titular $titular")
         println("Numero da conta $numeroConta")
         println("Saldo da conta $saldo")
         println()
        */
    // testaCondicoes(saldo)

    //for in soh permite quando o primeiro numero eh menor do que o ultimo da condicao
    //quando queremos diminuir temos que usar o downTo
    /*
    for(i in 5 downTo 1 step 1){
        println(i)
        //se quisermos parar a operacao utilizamos o if com o break
        if(i == 4){
            break
        }
    }
    */
}