fun sortStrings(strings: Array<String>): Array<String> {
    return strings.sortedArray()
}

fun main() {
    println("6)")
    val strings = arrayOf("banana", "apple", "cherry", "grape")
    val sortedStrings = sortStrings(strings)
    println(sortedStrings.joinToString(", "))
}