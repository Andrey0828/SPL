package Figurs

import kotlin.math.pow

class Circle(val radius: Double): Shape() {
    override fun area(): Double {
        return Math.PI * radius.pow(2.0)
    }
}