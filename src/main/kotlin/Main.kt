import java.math.BigDecimal

fun main() {
    println("Bem vindo ao ByteBank")
    val contaWill = Conta()
    contaWill.numero = 200
    contaWill.titular = "William"
    contaWill.deposita(200.0)

    val contaAna = Conta()
    contaAna.numero = 200
    contaAna.titular = "William"
    contaAna.deposita(200.0)

    println(contaWill)
    println(contaAna)

    println("Depositando na conta do William")
//    contaWill.saldo += 50.0
    contaWill.deposita(50.0)
    println(contaWill.saldo)

    println("Depositando na conta da Ana")
//    deposita(contaAna, 50.0)
//    deposita(contaAna, BigDecimal(50.0))
    contaAna.deposita(50.0)

    println(contaAna.saldo)
    contaAna.saca(50.0)
    try {
        contaAna.saca(500000.0)
    } catch (e: Conta.InsufficientFunds) {
        println("Não tem saldo!")
    }

    println(contaAna.saldo)
    println(contaWill.saldo)
    if (contaWill.transfere(150.0, contaAna)) {
        println("Transferência sucedida!")
    } else {
        println("Falha na transferência")
    }
    println(contaAna.saldo)
    println(contaWill.saldo)
}


fun deposita(conta: Conta, valor: BigDecimal) {
    conta.saldoDec += valor
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
        private set(valor) {
            if (valor > 0) field = valor
        }
    var saldoDec = BigDecimal("0.0")


    fun deposita(valor: Double) {
        saldo += valor
    }

    fun saca(valor: Double) {
        if (saldo < valor) throw InsufficientFunds()
        saldo -= valor
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo < valor) return false
        saldo -= valor
        destino.deposita(valor)
        return true
    }

//    fun getSaldo() = saldo
//    fun setSaldo(valor: Double) {
//        saldo = valor
//    }

    class InsufficientFunds : Exception("Fundos insuficientes.")
}


fun testaCopiasEReferencias() {
//    val contaWill = Conta()
//    contaWill.numero = 200
//    contaWill.titular = "William"
//    contaWill.saldo = 200.0
//
//    val contaAna = Conta()
//    contaAna.numero = 200
//    contaAna.titular = "William"
//    contaAna.saldo = 200.0
//
//    println(contaWill)
//    println(contaAna)
}

fun testaLacos() {
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
    //    testaCondicoes(saldo)

//    for (i in 1..3) println(i)
//    for (i in 1..3) {
//        println(i)
//    }
//    (1..5).forEach { i ->
//        println(i)
//        println(i + 1)
//    }
}
