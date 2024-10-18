package Figurs

class Triangle(val osnovanie: Double, val height: Double): Shape() {
    override fun area(): Double {
        return 1.0 / 3.0 * osnovanie * height
    }
}