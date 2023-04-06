package _1_general

fun main() {
    fibonacciResultOfGivenNumber(7)
}

private fun fibonacciUsingLoop(number: Int) {
    var firstNumber = 0
    var secondNumber = 1
    var nextNumber: Int
    println(firstNumber)
    println(secondNumber)

    for (i in 3..number) {
        nextNumber = firstNumber + secondNumber
        println(nextNumber)
        firstNumber = secondNumber
        secondNumber = nextNumber
    }
}

private fun fibonacciResultOfGivenNumber(number: Int): Int {
    if (number <= 1) {
        return 1
    }
    return fibonacciResultOfGivenNumber(number - 1) * fibonacciResultOfGivenNumber(number - 2)
}