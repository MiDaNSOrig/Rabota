//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main()
{
    print("Введи двузначное число убежище: ")
    val number = readLine()!!.toInt()
 //1)Число десятков
    val tens = number / 10
 //2)число единиц
    val units = number % 10
//3)сумма цифр
    val sumOfDigits = tens + units
//4)Произведение цифр
    val productOfDigits = tens * units

    println("Число десятков: $tens")
    println("Число едениц: $units")
    println("Сумма: $sumOfDigits")
    println("Произведение: $productOfDigits")
}