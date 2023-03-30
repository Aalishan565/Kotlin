package kotlin_basics

interface Dog {

    fun name() {
        println("this is dog")
    }

}

interface Cat {
    fun name() {
        println("this is cat")
    }

}

class D1 : Dog, Cat {
    override fun name() {
        super<Dog>.name()
      //  println("this is dog")
    }

}
class C1 : Cat {

}
fun main() {
    var d1 = D1()
    d1.name()
    var c1 = C1()
    c1.name()
}
