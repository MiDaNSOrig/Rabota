import kotlin.random.Random

fun main() {
    println("8)")
    val randomNumber = Random.nextInt(1, 101)
    println("Угадайте число от 1 до 100:")
    var guess = 0
    var attempts = 0
    while (guess != randomNumber) {
        attempts++
        print("Введите ваше предположение: ")
        guess = readLine()!!.toInt()
        if (guess < randomNumber) {
            println("Больше!")
        } else if (guess > randomNumber) {
            println("Меньше!")
        }
    }
    println("Поздравляю! Вы угадали за $attempts попыток.")
}