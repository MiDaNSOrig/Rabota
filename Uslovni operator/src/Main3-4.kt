//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main()
{
//3
   println("Введи 2 числа разной чётности: ")
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    if (first %2 != second %2)
    {
        val oddNumber = if (first % 2 != 0) first else second
        println("Нечётное число: $oddNumber")
    }
    else
    {
        println("Числа одинаковой чётности")
    }
//4
    println("Введи большее и меньшее числа: ")
    val bigger = readLine()!!.toInt()
    val smaller = readLine()!!.toInt()
    if (bigger % smaller == 0)
    {
        println("$bigger кратно $smaller")
    }
    else
    {
        val ostatok = bigger % smaller
        println("$bigger не кратно $smaller, остаток: $ostatok")
    }
}