fun getCompatibleBloodTypes(bloodType: String): String {
    return when (bloodType) {
        "А" -> "А, О"
        "В" -> "В, О"
        "АВ" -> "А, В, АВ, О"
        "О" -> "О"
        else -> "Некорректная группа крови"
    }
}

fun main() {
    println("Введи группу крови (А, В, АВ, О):")
    val bloodType = readLine() ?: ""
    println("Совместимые группы крови: ${getCompatibleBloodTypes(bloodType)}")
}