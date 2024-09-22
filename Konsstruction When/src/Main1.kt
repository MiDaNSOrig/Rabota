//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun getDayOfWeek(dayNumber: Int): String
{
    when (dayNumber)
    {
        1 -> return "Понедельник"
        2 -> return "Вторник"
        3 -> return "Среда"
        4 -> return "Четверг"
        5 -> return "Пяsssтница"
        6 -> return "Суббота"
        7 -> return "Воскресенье"
        else -> return "Некорректный номер дня"
    }
}
fun main()
{
    println("Введи номер дня недели: ")
    val dayNumber = readLine()?.toIntOrNull() ?: 0
    println(getDayOfWeek(dayNumber))
}