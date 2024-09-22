fun getErrorMessage(errorCode: Int): String {
    return when (errorCode) {
        111 -> "Ошибка 1"
        222 -> "Ошибка 2"
        333 -> "Ошибка 3"
        else -> "Неизвестная ошибка"
    }
}

fun main() {
    println("Введи код ошибки:")
    val errorCode = readLine()?.toIntOrNull() ?: 0
    println(getErrorMessage(errorCode))
}