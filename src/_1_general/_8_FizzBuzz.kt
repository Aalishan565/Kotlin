package _1_general

fun main() {
    fizzBuzzFun()
}

private fun fizzBuzzFun() {
    val counter = 100
    var c3 = 0
    var c5 = 0

    for (i in 1 .. counter) {
        var value = ""
        c3++
        c5++
        if (c3 == 3) {
            value += "fizz"
            c3 = 0
        }
        if (c5 == 5) {
            value += "Buzz"
            c5 = 0
        }
        if (value.isEmpty()) {
            println(i)
        } else {
            println(value)
        }
    }
}