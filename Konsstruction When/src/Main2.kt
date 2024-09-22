fun triangleType(a: Int, b: Int, c: Int): String {
    if (a + b <= c || a + c <= b || b + c <= a) {
        return "Не треугольник"
    } else if (a == b && a == c) {
        return "Равносторонний треугольник"
    } else if (a == b || a == c || b == c) {
        return "Равнобедренный треугольник"
    } else {
        return "Разносторонний треугольник"
    }
}

fun main() {
    println("Введи длину стороны a:")
    val a = readLine()?.toIntOrNull() ?: 0
    println("Введи длину стороны b:")
    val b = readLine()?.toIntOrNull() ?: 0
    println("Введи длину стороны c:")
    val c = readLine()?.toIntOrNull() ?: 0
    println(triangleType(a, b, c))
}