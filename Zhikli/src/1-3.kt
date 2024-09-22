fun main() {
//1
    for (i in 1..10) {
        println(i)
    }
//2
    for (i in 1..20) {
        if (i % 2 == 0) {
            println(i)
        }
    }
//3
    println("Введите число N:")
    val n = readLine()?.toIntOrNull() ?: 0
    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    println("Сумма чисел от 1 до $n: $sum")
}