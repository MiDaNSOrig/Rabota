fun main()
{
    print("Введи число: ")
    val base = readLine()!!.toDouble()

    print("Введи второе число: ")
    val stepen = readLine()!!.toInt()

    val result = Math.pow(base,stepen.toDouble())
    println("$base v stepeni $stepen = $result")
}