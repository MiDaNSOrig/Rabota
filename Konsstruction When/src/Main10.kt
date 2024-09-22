fun main() {
    println("Введи способ оплаты (наличные, кредитка, киви:")
    val paymentMethod = readLine() ?: ""

    when (paymentMethod) {
        "наличные" -> println("Оплата наличными.")
        "кредитка" -> println("Оплата кредитной картой.")
        "киви" -> println("Оплата через киви.")
        else -> println("Неизвестный способ оплаты.")
    }
}