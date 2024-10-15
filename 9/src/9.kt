import kotlin.random.Random

fun generatePassword(length: Int): String {
    val chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-={}[]|:;'<>,.?/"
    return (1..length).map { Random.nextInt(chars.length) }.map { chars[it] }.joinToString("")
}

fun main() {
    println("9)")
    val password = generatePassword(12)
    println("Сгенерированный пароль: $password")
}