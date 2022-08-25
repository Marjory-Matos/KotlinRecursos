fun testaCondicoes(saldo: Double) {

    if (saldo > 0.0) {
        println("conta eh positiva")
    } else if (saldo == 0.0) {
        println("conta eh neutra")
    } else {
        println("conta eh negativa")
    }

    //Substitui o if pelo when para que fique menor
    when {
        saldo > 0.0 -> {
            println("conta eh positiva")
        }
        saldo == 0.0 -> {
            println("conta eh neutra")
        }
        else -> {
            println("conta eh negativa")
        }
    }

    //e ainda conseguimos diminuir mais tirando as chaves e colocando na mesma clinha
    when {
        saldo > 0.0 -> println("conta eh positiva")
        saldo == 0.0 -> println("conta eh neutra")
        else -> println("conta eh negativa")
    }

}