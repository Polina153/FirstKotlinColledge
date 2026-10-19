
object DataBase {
    val name = "main.db"
    val version = 1
    val data = mutableListOf<String>()
    fun insertData(str: String) {
        data.add(str)
    }
}


/*
class DataBase private constructor(){
    val name = "main.db"
    val version = 1
    val data = mutableListOf<String>()
    fun insertData(str: String) {
        data.add(str)
    }

    companion object {
        private var db: DataBase? = null
        fun getInstance(): DataBase {
            db?.let {
                return it
            }
            val instance = DataBase()
            db = instance
            return instance
        }
    }
}*/
