//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main()
{
//12
    println("Введи двузначное число: ")
    val twoNum = readLine()!!.toInt()
    val tens = twoNum / 10
    val units = twoNum % 10
    if (tens > units)
    {
        println("Первая цифра больше второй")
    }
    else if (tens < units)
    {
        println("Вторая цифра больше первой")
    }
    else
    {
        println("Цифры одинаковы")
    }
}