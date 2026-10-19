
fun main() {
   /* val db = DataBase
    db.insertData("1")
    db.insertData("2")
    for (str in db.data) {
        println(str)
    }
    println()
    val test = Test()
    test.insertTestData("3")
    test.insertTestData("4")
    for (str in db.data) {
        println(str)
    }*/

   /* val firstList = listOf(1, 4, 10)
    println(firstList.mathWithIt { it + 2 })

    val mult2: (Int) -> Int = { it * 2 }
    //val mult2: (Int) -> Int = {n: Int -> n * 2}
    val add2: (Int) -> Int = { it + 2 }

    val multList = mathWithList(firstList, mult2)
    val addList = mathWithList(firstList) { it + 2 }

    println(multList)  // [2, 8, 20]
    println(addList)   // [3, 6, 12]*/

    val data = mapOf<String, List<Int>>(
        "Январь" to listOf(67, 23, 56, 90),
        "Февраль" to listOf(67, 37, 56, 41),
        "Март" to listOf(70, 23, -14, 30),
        "Апрель" to listOf(67, 54, 56, 30),
        "Май" to listOf(67, 23, 43, 30),
        "Июнь" to listOf(60, 23, 56, 39),
        "Июль" to listOf(67, 23, 61, 30),
        "Август" to listOf(67, 23, 56, 42),
        "Сентябрь" to listOf(-35, 23, 56, 23),
        "Октябрь" to listOf(70, 23, 56, 30),
        "Ноябрь" to listOf(67, 32, 56, 45),
        "Декабрь" to listOf(67, 23, -45, 30)
    )
    printInfo(data)
}

fun printInfo(collection: Map<String, List<Int>>) {
    with(collection) {
        val averageOfMonth = filterNot {
            it.value.any { it < 0 }
        }.flatMap { it.value }.average()
        println("Average revenue per month:$averageOfMonth")

        val averageOfWeek = filterNot {
            it.value.any { it < 0 }
        }.mapValues { it.value.average() }.entries
        println("Average revenue per week:$averageOfWeek")

        val maxRevenueOfMonth = filter {
            it.value.all { it > 0 }
        }.mapValues { it.value.sum() }.maxBy { it.value }
        println("Maximum monthly income: $maxRevenueOfMonth")

        val minRevenueOfMonth = filter {
            it.value.all { it > 0 }
        }.mapValues { it.value.sum() }.minBy { it.value }
        println("Minimum monthly income: $minRevenueOfMonth")

        val monthWithError = filterNot { it.value.all { it > 0 } }.keys
        println("Month with error: $monthWithError")
    }
}


fun mathWithList(yourList: List<Int>, math: (Int) -> Int): List<Int> {
    val newList = mutableListOf<Int>()
    for (i in yourList) {
        newList.add(math(i))
    }
    return newList
}

fun List<Int>.mathWithIt(math: (Int) -> Int): List<Int> {
    val newList = mutableListOf<Int>()
    for (i in this) {
        newList.add(math(i))
    }
    return newList
}