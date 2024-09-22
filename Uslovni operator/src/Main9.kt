//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main()
{
//9
    println("Введи 2 целых числа t и n:")
    val t = readLine()!!.toInt()
    val n = readLine()!!.toInt()
    if (t % n == 0)
    {
        println("Частное от деления:${t / n}")
    }
        else
    {
        println("$t на $n нацело не делится")
    }
}