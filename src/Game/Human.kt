package Game

import kotlin.random.Random

abstract class Human(var health: Int, val power: Int) {
    fun attack(human: Human) {
        human.health -= Random.nextInt(1, 6) * human.power
    }
    abstract fun health(human: Human)
}