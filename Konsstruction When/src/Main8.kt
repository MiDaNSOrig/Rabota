fun getCookingTime(foodType: String): Int {
    return when (foodType) {
        "пицца" -> 17
        "суп" -> 78
        "борщ" -> 77
        "торт" -> 90
        else -> 0
    }
}

fun main() {
    println("Введи тип пищи:")
    val foodType = readLine() ?: ""
    val cookingTime = getCookingTime(foodType)
    if (cookingTime == 0) {
        println("Неизвестный тип пищи.")
    } else {
        println("Примерное время приготовления: $cookingTime минут.")
    }
}