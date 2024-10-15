fun findSmallest(numbers: List<Int>): Int {
    return numbers.minOrNull() ?: 0 // Возвращаем 0, если список пуст
}

fun main() {
    println("Введите список чисел (через пробел):")
    val input = readLine()!!.split(" ")
    val numbers = input.map { it.toInt() }
    val smallest = findSmallest(numbers)
    println("Самое маленькое число: $smallest")
}