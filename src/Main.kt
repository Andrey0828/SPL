import Models.Animal
import Models.Car
import java.awt.Color
import java.util.Arrays

fun main() {
//    val car1 = Car(Color.red, 123, "Lada Sedan")
//    val car2 = Car(Color.red, 123, "Lada Sedan")
//    val car3 = Car(Color.red, 123, "Lada Sedan")
//    val car4 = Car(Color.red, 123, "Lada Sedan")
//
//    val cabriolet = Cabriolet(Color.PINK, 777, "BMW")
//    val gruzovik = Gruzovik(Color.red, 123, "Lada Sedan", Destination.North)
//
//    car1.reDraw(Color.black)
//    cabriolet.changeStateRoof()
//    car1.setColor(Color.DARK_GRAY)
//    println(car1.getColor())
//
//    val animal: Animal = Animal("123", "Кенгуру", 10)
//
//    when (gruzovik.destination) {
//        Destination.North -> {
//            println("Едем")
//        }
//        Destination.South -> {}
//        Destination.West -> {}
//        Destination.East -> {}
//    }
//    println(Car.count)
//    car1.makeSignal()
//    car2.makeSignal()
//    car3.makeSignal()
//    car4.makeSignal()
//    println(Car.count)
    val car1 = Car(Color.red, 101, "Lada Sedan")
    val car2 = Car(Color.red, 7578, "Lada Sedan")
    val car3 = Car(Color.red, 3475, "Lada Sedan")
    val car4 = Car(Color.red, 87, "Lada Sedan")

    val arrayCars = arrayOf(car1, car2, car3, car4)
    println(arrayCars.contentToString())

    val customComparator = CustomComparator()

    Arrays.sort(arrayCars, CustomComparator())

    fun hi() {}
}