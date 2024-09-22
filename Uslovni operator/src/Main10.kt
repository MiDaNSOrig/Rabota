//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main()
{
//10
    println("Введи 2 числа a и b: ")
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    if (b % a == 0) {
        println("$a явлется делителем $b")
    }
    else
    {
        println("$a не явлется делителем $b")
    }
}