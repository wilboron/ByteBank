fun main() {
    println("Bem vindo ao ByteBank")
    var i = 0
    while (i < 5) {
        val titular = "William $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("Titular $titular")
        println("Numero da conta: $numeroConta")
        println("Saldo da conta $saldo")
        println()
        i++
    }
////    for (i in 1..5)
//    for (i in 5 downTo 1) {
//
//        if (i == 4) {
//            continue
////            break
//        }
//
//        val titular = "William $i"
//        val numeroConta = 1000 + i
//        var saldo = i + 10.0
//
//        println("Titular $titular")
//        println("Numero da conta: $numeroConta")
//        println("Saldo da conta $saldo")
//        println()
//
//    }
}

fun testaCondicoes(saldo: Double) {
    //    saldo = -1.0
    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }

//    when {
//        saldo > 0.0 -> {
//            println("Conta é positiva")
//        }
//        saldo == 0.0 -> {
//            println("Conta é neutra")
//        }
//        else -> {
//            println("Conta é negativa")
//        }
//    }
}

//    testaCondicoes(saldo)

//    for (i in 1..3) println(i)
//    for (i in 1..3) {
//        println(i)
//    }
//    (1..5).forEach { i ->
//        println(i)
//        println(i + 1)
//    }