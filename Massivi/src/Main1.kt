import kotlin.random.Random
fun main() {
    //1 Создание и вывод элементов
    val numbers1 = intArrayOf(1, 2, 3, 4, 5)
    println("1)Massiv ${numbers1.contentToString()}")
    //2 Сумма элементов массива
    val sum = numbers1.sum()
    println("2)Сумма элементов массива: $sum")
    //3 Максимальное и минимальное значение
    val numbers2 = intArrayOf(10, 5, 20, 15, 30, 25, 40, 35, 50, 45)
    val max = numbers2.maxOrNull() ?: 0
    val min = numbers2.minOrNull() ?: 0
    println("3)Max $max")
    println("3.1)Min $min")
    //4 Сортировка массива
    val numbers3 = intArrayOf(5, 2, 8, 1, 9)
    numbers3.sort()
    println("4)Отсортированный массив: ${numbers3.contentToString()}")
    //5 Уникальные элементы
    val numbers4 = intArrayOf(1, 2, 2, 3, 4, 4, 5)
    val uniqueElements = numbers4.toSet()
    println("5)Уникальные элементы: $uniqueElements")
    //6 Четные и нечетные числа
    val numbers5 = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val eNumbers = numbers5.filter { it % 2 == 0 }
    val oddNumbers = numbers5.filter { it % 2 != 0 }
    println("6)Чётные: ${eNumbers}")
    println("6)Нечётные: ${oddNumbers}")
    //7 Реверс массива
    val numbers6 = intArrayOf(1, 2, 3, 4, 5)
    val reversedArray = numbers6.reversedArray()
    println("7)Реверсированный массив: ${reversedArray.contentToString()}")
    //8 Поиск элемента
    val numbers7 = intArrayOf(1, 2, 3, 4, 5)
    val element = 3
    val index = numbers7.indexOf(element)
    if (index != -1) {
        println("8)Элемент $element найден по индексу $index")
    } else {
        println("8)Элемент $element не найден по индексу $index")
    }
    //9 Копирование массива
    val numbers8 = intArrayOf(1, 2, 3, 4, 5)
    val newArray = numbers8.copyOf()
    println("9)Новыймассив: ${newArray.contentToString()}")
    //10 Сумма четных чисел
    val numbers9 = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val sumE = numbers9.filter { it % 2 == 0 }.sum()
    println("10)Сумма чётных чисел: $sumE")
    // 11. Пересечение массивов
    val numbers10 = intArrayOf(1, 2, 3, 4, 5)
    val numbers11 = intArrayOf(3, 4, 5, 6, 7)
    val peres = numbers10.toSet().intersect(numbers11.toSet())
    println("11)Пересечение массивов: $peres")
    // 12. Перестановка элементов
    val numbers12 = intArrayOf(1, 2, 3, 4, 5)
    if (numbers12.size > 1)
    { // Проверка на то, что массив не пустой
        val temp = numbers12[0]
        numbers12[0] = numbers12[1]
        numbers12[1] = temp
        println("12)Массив после перестановки: ${numbers12.contentToString()}")
    }
    else
    {
        println("12)Массив мал для перестановки элементов.")
    }
    // 13. Заполнение случайными числами
    val randomNumbers = IntArray(20) { Random.nextInt(1, 101) }
    println("13)Массив случайных чисел: ${randomNumbers.contentToString()}")
    // 14. Числа Прокопенко
    val numbers13 = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
    val div = numbers13.filter { it % 3 == 0 }
    println("14)Числа Прокопенко: $div")
    // 15. Проверка на палиндром
    val numbers14 = intArrayOf(1, 2, 3, 2, 1)
    val isi = numbers14.contentEquals(numbers14.reversedArray())
    println("15)Является ли массив палиндромом: $isi")
    // 16. Конкатенация двух массивов
    val numbers15 = intArrayOf(1, 2, 3)
    val numbers16 = intArrayOf(4, 5, 6)
    val conArray = numbers15 + numbers16
    println("16)Конкатенированный массив: ${conArray.contentToString()}")
    // 17. Сумма и произведение
    val numbers17 = intArrayOf(1, 2, 3, 4, 5)
    val sum17 = numbers17.sum()
    val product17 = numbers17.reduce { acc, i -> acc * i }
    println("17)Сумма элементов массива: $sum17")
    println("17)Произведение элементов массива: $product17")
    // 19. Слияние двух массивов
    val numbers19 = intArrayOf(1, 3, 5, 7, 9)
    val numbers20 = intArrayOf(2, 4, 6, 8, 10)
    val mergedArray = (numbers19 + numbers20).sortedArray()
    println("19)Слитый массив: ${mergedArray.contentToString()}")
}

