fun main() {
    //val animal1 = Animal(name = "Mursik")
  /*  val animal2 = Cat("Mursik")
    println(animal2.name)*/
    /*val animal3 = Dog("Tuzik")
    println(animal3.name)
    animal3.barking()
    animal3.guard()*/
    val cat = Cat("Barsik", 105)
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
    cat.printInfo()

    /*    val user1 = User(23)
        val user2 = User("Harry Potter")*/
}

/*
class User(val id: Int) {     // 1️⃣ Первичный конструктор

    val name = "Гость" // 2️⃣ Поле-инициализатор

    init {             // 3️⃣ init #1
        println("🔥 init #1: id=$id")
        //require(id!= 0) { "ID должен быть больше 0!" }
    }

    val email = "${id}@example.com" // 4️⃣ Поле после init

    init {             // 5️⃣ init #2
        println("🔥 init #2: name=$name")
    }

    constructor(name: String) : this(0) { // 6️⃣ Вторичный
        println("🔥 Вторичный конструктор: name=$name")
        //this.name = name  // ⚠️ Нельзя! val неизменяемо
    }

    init {             // 5️⃣ init #3
        println("🔥 init #3: name=$name")
    }

}*/
