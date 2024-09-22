fun getNationality(country: String): String {
    return when (country) {
        "США" -> "Американец"
        "Россия" -> "Россиянин"
        "Япония" -> "Японец"
        else -> "Неизвестная национальность"
    }
}

fun main() {
    println("Введи страну:")
    val country = readLine() ?: ""
    println("Национальность: ${getNationality(country)}")
}