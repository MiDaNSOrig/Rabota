//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main()
{
//11
    println("Введи натуральное число: ")
    val natural = readLine()!!.toInt()
    println("Чeтное: ${natural % 2 == 0}")
    println("Оканчивается на 7: ${natural % 10 == 7}")
}