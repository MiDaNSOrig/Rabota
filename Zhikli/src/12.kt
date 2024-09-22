fun main() {
    println("Введи начальное число:")
    val start = readLine()?.toIntOrNull() ?: 0
    println("Введи шаг:")
    val step = readLine()?.toIntOrNull() ?: 0
    println("Числовая последовательность:")
    for (i in 0..10) {
        println(start + i * step)
    }
}