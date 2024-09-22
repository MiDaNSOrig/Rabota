fun main() {
    println("Введи строку:")
    val str = readLine() ?: ""
    if (isPalindrome(str)) {
        println("$str - палиндром")
    } else {
        println("$str - не палиндром")
    }
}

fun isPalindrome(str: String): Boolean {
    val reversedStr = str.reversed()
    return str.equals(reversedStr, ignoreCase = true)
}