package _1_general

fun main() {
    println("The factorial of given number is ${factorialUsingRecursion(4)}")
}

fun factorialUsingLoop(number: Int): Int {
    var result = 1
    var counter = 1
    while (counter <= number) {
        result *= counter
        //result = result * counter
        counter++
    }
    return result
}

fun factorialUsingRecursion(fact: Int): Int {
    if (fact == 0) {
        return 1
    }
    return fact * factorialUsingRecursion(fact - 1)
}