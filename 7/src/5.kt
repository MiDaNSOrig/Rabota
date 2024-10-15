fun areEqual(num1: Int, num2: Int): Boolean {
    return num1 == num2
}

fun main() {
    println("Введите первое число:")
    val num1 = readLine()!!.toInt()
    println("Введите второе число:")
    val num2 = readLine()!!.toInt()

    if (areEqual(num1, num2)) {
        println("Числа равны")
    } else {
        println("Числа не равны")
    }
}