import java.util.*

fun main() {
    /*    val r = 10.8
        val pi = 3.14
        val s = pi * r * r
        println("Площадь круга равна: $s")

        val r1: Float = 10.8F
        val pi1: Float = 3.14F
        val s1: Float = (pi * r * r).toFloat()
        println("Площадь круга равна: $s1")

        val ch = '@'
        val ch2 = ch.toInt()
        println(ch)
        println(ch2)*/
    /* val scanner = Scanner(System.`in`)
     println("Введите имя: ")
     val name = scanner.next()
     print("Hello, $name!")*/
    /*var i = 1
    while (i <= 1000) {
        println(i)
        if (i == 5) {
            break
        }
        i++
    }*/
    /*var sum = 0
    var count = 1
    while (count <= 100) {
        sum += count
        count++
    }
    val result: Float = (sum / count).toFloat()
    println(result)


    val someArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(someArray.average())*/
    val daysOfMonth = arrayOfNulls<Int>(12)
    daysOfMonth[0] = 31
    daysOfMonth[1] = 28
    daysOfMonth[2] = 31
    daysOfMonth[3] = 30
    daysOfMonth[4] = 31
    daysOfMonth[5] = 30
    daysOfMonth[6] = 31
    daysOfMonth[7] = 31
    daysOfMonth[8] = 30
    daysOfMonth[9] = 31
    daysOfMonth[10] = 30
    daysOfMonth[11] = 31
    println(daysOfMonth.joinToString())
    println(daysOfMonth.contentToString())

    val numbers = arrayOfNulls<Int>(101)
    for ((index) in numbers.withIndex()) {
        numbers[index] = index
    }
    println(numbers.joinToString())
}
