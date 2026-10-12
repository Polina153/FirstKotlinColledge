import java.util.TreeSet

const val PI = 3.14

fun main() {
    //val animal1 = Animal(name = "Mursik")
    /*  val animal2 = Cat("Mursik")
      println(animal2.name)*/
    /*val animal3 = Dog("Tuzik")
    println(animal3.name)
    animal3.barking()
    animal3.guard()*/
    /*    val cat = Cat("Barsik", 105)
        val plate = Plate(0)
        plate.info()
        cat.printInfo()
        cat.eat(plate)
        plate.info()
        cat.printInfo()
        plate.increaseFood(200)
        plate.info()
        cat.printInfo()
        cat.eat(plate)
        plate.info()
        cat.printInfo()*/
    /* // LET
     var nullableName: String? = "Kotlin"

     nullableName?.length

     nullableName?.let {
         println(it.length)
         println("Привет, $it!") // Выводится только если nullableName не null
     }

     val list = mutableListOf<Int>()

     list.also {
         println("Список до добавления: $it")
     }.add(10)

     println("Список после добавления: $list")*/
    /*    //RUN
        val rectangle = Rectangle(width = 10, height = 5)

        val area = rectangle.run {
            width * height
        }

        val area2 = rectangle.width * rectangle.height

        println("Площадь прямоугольника: $area")*/
    /*//WITH
    val circle = Circle(radius = 7)

    val rectangle = Rectangle(width = 10, height = 5)

    val perimeter = with(circle) {
        PI * radius * 2
    }

    with(rectangle) {
        width *= 2
        height *= 3
        println("Rectangle width = $width and height = $height")
    }

    println("Длина окружности: $perimeter")

}

data class Rectangle(var width: Int, var height: Int)
data class Circle(val radius: Int)*/
    /*val builder = StringBuilder()
    builder.apply {
        append("Привет, ")
        append("мир!")
        append(" Hello ")
        append("world!")
        append(" Hi, ")
        append("hi!")
    }

    println(builder)*/
    val myArrayList = listOf<String>("Winter", "Spring", "Summer", "Autumn")
    println(myArrayList)
    myArrayList[3]
    val myLinkedList = LinkedHashMap<String, Int>()
    val myLinkedHashSet = LinkedHashSet<Int?>()
    val set = setOf('a', 'b', 'c', 'a', 'b', 'c')//элементы уникальны! Потому коллекция хранит в себе только 3 элемента
    println(set)
    val map = mapOf("key" to 100, "age" to 30)
    println(map)
    val mutableMap = mutableMapOf("name" to "Иван").apply { this["city"] = "Москва" }
    println(mutableMap)

    val numbers = TreeSet<Int>()
    numbers.add(50)
    numbers.add(30)
    numbers.add(40)
    println(numbers)
    println(numbers.first())
    val fruits = TreeSet(listOf("Apple", "Banana", "Cherry"))
    fruits.add("Cherry")
    fruits.add("Blueberry")
    println(fruits)
}
