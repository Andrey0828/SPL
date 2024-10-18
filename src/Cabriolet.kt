import Models.Car
import java.awt.Color

class Cabriolet(color: Color, gosNumber: Int, model: String): Car(color, gosNumber, model) {
    var stateRoof: Boolean = false

    override fun makeSignal() {
//        super.makeSignal()
        println("Тихий звук")
    }

    fun changeStateRoof() {
        stateRoof = !stateRoof
    }
}