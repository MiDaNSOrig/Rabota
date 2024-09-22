fun main()
{
    print("Введи первое число: ")
    val num1 = readLine()!!.toDouble()

    print("Введи второе число: ")
    val num2 = readLine()!!.toDouble()

    if(num2 == 0.0)
    {
        println("Деление на ноль возможно???")
    }
    else
    {
        val result = num1 / num2
        println("$num1 / $num2 = $result")
    }
}