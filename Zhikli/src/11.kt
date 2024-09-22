fun main() {
    println("Введи первую строку:")
    val str1 = readLine() ?: ""
    println("Введи вторую строку:")
    val str2 = readLine() ?: ""
    if (isAnagram(str1, str2)) {
        println("$str1 и $str2 - анаграммы")
    } else {
        println("$str1 и $str2 - не анаграммы")
    }
}

fun isAnagram(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) {
        return false
    }
    val sortedStr1 = str1.toCharArray().sortedArray()
    val sortedStr2 = str2.toCharArray().sortedArray()
    return sortedStr1.contentEquals(sortedStr2)
}