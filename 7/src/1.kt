fun main() {
    println("первое число:")
    val num1 = readLine()!!.toDouble()
    println("(+, -, *, /):")
    val operation = readLine()!!
    println("второе число:")
    val num2 = readLine()!!.toDouble()

    val result = when (operation) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else {
            println("Деление на ноль невозможно")
            return
        }
        else -> {
            println("Неверная операция")
            return
        }
    }
    println("Результат: $result")
}