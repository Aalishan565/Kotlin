package _0_kotlin_basics

interface City {
    fun name()
    fun cityBus() {
        println("Has city bus")
    }
}

class Bangalore : City {
    override fun name() {
        println("Bangalore")
    }


}

class Chennai : City {
    override fun name() {
        println("Name")
    }
}


fun main() {
    var bangalore = Bangalore()
    bangalore.name()
    bangalore.cityBus()

}