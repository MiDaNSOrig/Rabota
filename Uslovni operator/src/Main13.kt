//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main()
{
//13
    println("Введи 4значное число: ")
    val fourNum = readLine()!!.toInt()
    println("Введи число a: ")
    val a = readLine()!!.toInt()
    val firstSum = (fourNum / 1000) + (fourNum % 10)
    val secondSum = (fourNum / 10 % 10) + (fourNum % 10)
    val digit1 = fourNum / 1000
    val digit2 = fourNum / 100 % 10
    val digit3 = fourNum / 10 % 10
    val digit4 = fourNum % 10
    val totalSum = digit1 + digit2 + digit3 + digit4
    val product = digit1 * digit2 * digit3 * digit4
    if (firstSum == secondSum)
    {
        println("Сумма первых двух цифр равна сумме последних двух")
    }
    else
    {
        println("Суммы первых и последних не равны")
    }
    println("Сумма цифр кратна 3: ${totalSum % 3 == 0}")
    println("Произведение цифр кратно 4: ${product % 4 == 0}")
    println("Произведение цифр кратно a: ${product % a == 0}")
}