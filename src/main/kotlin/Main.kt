// Базовый класс транспортного средства
open class Vehicle

// Конкретные транспортные средства
class Car : Vehicle()
class Truck : Vehicle()
class Motorcycle : Vehicle()

// Каркас парковки, принимающий транспортное средство любого типа
class CarPark<T : Vehicle> {
    private val vehicles = mutableListOf<T>()

    // Добавляем транспорт в парковку
    fun park(vehicle: T) {
        vehicles.add(vehicle)
    }

    // Количество припаркованных транспортных средств
    fun countVehicles(): Int {
        return vehicles.size
    }

    // Возвращает список припаркованных транспортных средств (covariant)
    fun vehicles(): List<@UnsafeVariance T> {
        return vehicles
    }
}

// Пример использования:
fun main() {
    // Создаем парковку для легковых автомобилей
    val carParking = CarPark<Car>()
    carParking.park(Car())
    carParking.park(Car())
    println(carParking.countVehicles()) // Output: 2
    println(carParking.vehicles()) // Output: [Car, Car]

    // Создаем парковку для грузовых автомобилей
    val truckParking = CarPark<Truck>()
    truckParking.park(Truck())
    println(truckParking.countVehicles()) // Output: 1
    println(truckParking.vehicles()) // Output: [Truck]

    // Универсальная парковка, принимающая любые транспортные средства
    val universalParking = CarPark<Vehicle>()
    universalParking.park(Car())
    universalParking.park(Truck())
    universalParking.park(Motorcycle())
    println(universalParking.countVehicles()) // Output: 3
    println(universalParking.vehicles()) // Output: [Car, Truck, Motorcycle]
}