abstract class Language() {
    abstract fun know()
    open fun communication() {
        println("English language")
    }
}

class A : Language() {
    override fun know() {
        println("I know Kotlin")
    }

}

class B : Language() {
    override fun know() {
        println("I know Java")
    }
}

fun main() {
    var a = A()
    a.know()
    a.communication()
    var b = B()
    b.know()
}