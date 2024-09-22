//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main()
{
//8
    println("Введи растоние в км:")
    val km = readLine()!!.toDouble()
    println("Введи растояние в футах:")
    val fut = readLine()!!.toDouble()
    val futInM = fut * 0.305
    val kmInM = km * 1000
    if (kmInM < futInM)
    {
        println("Расстояние в км меньше расстояния в футах")
    }
    else
    {
        println("Расстояяние в футах меньше расстояния в км")
    }
}