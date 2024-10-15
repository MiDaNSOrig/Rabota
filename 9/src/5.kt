fun main() {
    println("5)")
    val n = 100
    for (i in 2..n) {
        if (isPrime(i)) {
            println(i)
        }
    }
}

fun isPrime(number: Int): Boolean {
    if (number <= 1) {
        return false
    }
    for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}