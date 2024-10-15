fun findLongestWord(text: String): String {
    val words = text.split("[\\s.,!?;:]+".toRegex())
    var longestWord = words[0]
    for (word in words) {
        if (word.length > longestWord.length) {
            longestWord = word
        }
    }
    return longestWord
}

fun main() {
    println("10)")
    val inputString = "This is a test string."
    val longestWord = findLongestWord(inputString)
    println("Самое длинное слово: $longestWord")
}