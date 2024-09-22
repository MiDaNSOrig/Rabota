fun main()
{
    print("Введи число: ")
    val number = readLine()!!.toDouble()

    val koren = Math.sqrt(number)
    println("Квадратный корень из $number = $koren")
}
