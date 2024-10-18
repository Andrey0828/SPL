package Models

import IFly
import ISwim
import java.awt.Color

open class Car(private var color: Color = Color.blue, var gosNumber: Int, private var model: String): IFly, ISwim {

    override var countFlying: Int = 0

    companion object {
        var count: Int = 0

        fun countIncrease() {
            count++
        }
    }

    open fun makeSignal() {
        println("Громкий звук")
        countIncrease()
    }
    fun reDraw(color: Color) {
        this.color = color
    }

    fun getColor(): Color {
        return this.color
    }

    fun setColor(color: Color) {
        this.color = color
    }

    override fun toString(): String {
        return "Car(gosNumber=$gosNumber)"
    }

    override fun fly() {
        super.fly()
        // Научил машину летать
    }

    override fun swim() {
        super.swim()
        // Научил машину плвать
    }
}
