import kotlin.random.Random

fun main() {
    val secretNumber = Random.nextInt(1, 101)
    var attempts = 0
    println("Число от 1 до 100. Угадай")

    while (true) {
        attempts++
        println("Попытка $attempts. Введи число:")
        val guess = readLine()?.toIntOrNull() ?: 0

        if (guess == secretNumber) {
            println("Ты угадал с $attempts попытки")
            break
        } else if (guess < secretNumber) {
            println("Загаданное число больше.")
        } else {
            println("Загаданное число меньше.")
        }
    }
}