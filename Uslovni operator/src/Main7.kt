//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main()
{
//7
   println("Введи 2 различных числа: ")
   val chislo1 = readLine()!!.toDouble()
   val chislo2 = readLine()!!.toDouble()
   println("Большее число: ${maxOf(chislo1, chislo2)}")
   println("Меньшее число: ${minOf(chislo1, chislo2)}")
}