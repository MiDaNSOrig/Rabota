//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main()
{
//5
    println("Введи длины трёх сторон треугольника: ")
    val side1 = readLine()!!.toDouble()
    val side2 = readLine()!!.toDouble()
    val side3 = readLine()!!.toDouble()
    if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1)
    {
        println("Треугольник существует")
    }
    else
    {
        println("Его никогда НЕ СУЩЕСТВОВАЛО.........")
    }
}