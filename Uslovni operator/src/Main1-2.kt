//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main()
{
//1
    println("Введи 3 числа: ")
    val num1 = readLine()!!.toDouble()
    val num2 = readLine()!!.toDouble()
    val num3 = readLine()!!.toDouble()
    val maxNumber = maxOf(num1, num2, num3)
    println("Максимальное число: $maxNumber")
//2
    if (num1 == num2 || num1 == num3 || num2 == num3)
    {
        println("Ошибка: есть равные числа")
    }
    else
    {
        val average = (num1 + num2 + num3) /3
        println("Среднее число: $average")
    }
}