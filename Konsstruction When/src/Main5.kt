fun getSign(number: Int): String {
    return when {
        number > 0 -> "Положительное"
        number < 0 -> "Отрицательное"
        else -> "Ноль"
    }
}

fun main() {
    println("Введи число:")
    val number = readLine()?.toIntOrNull() ?: 0
    println(getSign(number))
}