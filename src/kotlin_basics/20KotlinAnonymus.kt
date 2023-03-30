package kotlin_basics

interface X {
    fun x()
}

fun main() {
    var x: X = object : X {
        override fun x() {
            print("from x")
        }

    }

}