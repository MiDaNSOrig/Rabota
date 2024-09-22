fun main() {
    println("Введи строку:")
    val str = readLine() ?: ""
    println("Символы строки:")
    for (i in 0 until str.length) {
        println(str[i])
    }
}