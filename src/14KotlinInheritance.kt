// by default every class is final in kotlin
// for achieving inheritance we need to make class open
//Super class
open class Human {

    // need to make open method for overriding
    open fun think() {
        println("Human thinking")
    }
}

//child class extending Human class
class Programmer : Human() {
    override fun think() {
        println("Programmer thinking")
    }
}

fun main() {
    var human = Human()
    human.think()
    var programmer = Programmer()
    programmer.think()
}