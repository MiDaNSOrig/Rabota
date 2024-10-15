fun toggleCase(text: String): String {
    return text.map {
        if (it.isUpperCase()) {
            it.lowercaseChar()
        } else {
            it.uppercaseChar()
        }
    }.joinToString("")
}

fun main() {
    println("7)")
    val inputString = "Hello World!"
    val result = toggleCase(inputString)
    println(result) // Вывод: hELLO wORLD!
}