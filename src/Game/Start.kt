package Game

fun main() {
    val wizard = Wizard(100, 5, 100)
    val robot = Robot(100, 5, 100)
    val knight = Knight(100, 5, 100)
    wizard.attack(robot)
    println(robot.health)
}