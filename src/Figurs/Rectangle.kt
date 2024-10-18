package Figurs

class Rectangle(val weight: Double, val height: Double): Shape() {
    override fun area(): Double {
        return this.weight * this.height
    }
}