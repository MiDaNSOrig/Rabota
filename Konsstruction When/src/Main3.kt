fun getGrade(score: Int): String {
    when (score) {
        in 90..100 -> return "Отлично"
        in 80..89 -> return "Хорошо"
        in 70..79 -> return "Удовлетворительно"
        in 0..69 -> return "Неудовлетворительно"
        else -> return "Некорректный балл"
    }
}

fun main() {
    println("Введи балл:")
    val score = readLine()?.toIntOrNull() ?: 0
    println(getGrade(score))
}