//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main()
{
    print("Введи трёхзначное число убежище: ")
    val number = readLine()!!.toInt()
 //1)Число десятков
    val tens = (number / 10) % 10
 //2)число единиц
    val units = number % 10
//3)сумма цифр
    val hundreds = number / 100
    val sumOfDigits = hundreds + tens + units
//4)Произведение цифр
    val productOfDigits = hundreds * tens * units

    println("Число десятков: $tens")
    println("Число едениц: $units")
    println("Сумма: $sumOfDigits")
    println("Произведение: $productOfDigits")
}