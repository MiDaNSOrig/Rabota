fun getTimeOfDay(hour: Int): String {
    return when (hour) {
        in 6..11 -> "Утро"
        in 12..17 -> "День"
        in 18..23 -> "Вечер"
        in 0..5 -> "Ночь"
        else -> "Некорректное время"
    }
}

fun main() {
    println("Введи час (0-23):")
    val hour = readLine()?.toIntOrNull() ?: 0
    println(getTimeOfDay(hour))
}