open class Human{
   open fun think(){
        println("Human thinking")
    }
}
class Programmer:Human(){
   override fun think(){
        println("Programmer thinking")
    }
}
fun main(){
    var human=Human()
    human.think()
    var programmer=Programmer();
    programmer.think()
}