fun isPalindrome(word: String): Boolean {
    val cleanWord = word.lowercase().replace("[^a-zA-Z0-9]".toRegex(), "")
    return cleanWord == cleanWord.reversed()
}

fun main() {
    println("Введите слово:")
    val word = readLine()!!
    if (isPalindrome(word)) {
        println("$word - палиндром")
    } else {
        println("$word - не палиндром")
    }
}