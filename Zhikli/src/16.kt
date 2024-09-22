fun main() {
    println("Введи N:")
    val n = readLine()?.toIntOrNull() ?: 0
    var sum = 0
    for (i in 1..n) {
        sum += i * i
    }
    println("Сумма квадратов чисел от 1 до $n: $sum")
}