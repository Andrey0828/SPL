import Models.Car
import java.awt.Color

class Gruzovik(color: Color, gosNumber: Int, model: String, var destination: Destination): Car(color, gosNumber, model) {
    override fun makeSignal() {
        println("Very громкий звук")
    }
}
