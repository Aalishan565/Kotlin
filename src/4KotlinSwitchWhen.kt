fun main() {
    var num1 = 2

    // 1st way
    when (num1) {
        1 -> println("The number is one")
        2 -> println("The number is Two")
        3 -> println("The number is Three")
        else -> println("No match found")
    }

    // 2nd way
   /* var number = when (num1) {
        1 -> "one"
        2 -> "two"
        3 -> "three"
        else -> "no number"
    }
    println(number)*/
}
