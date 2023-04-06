package _1_general

fun main() {
    swapTwoNumberWithoutThirdVariable()
}

private fun swapTwoNumberWithoutThirdVariable() {
    var number1 = 10
    var number2 = 5
    println("Before swap:")
    println("Number 1 :$number1")
    println("Number 2 :$number2")
    number1 += number2 //number1 = number1 + number2 //15
    number2 = number1 - number2 //10
    number1 -= number2 //number1 = number1 - number2 //5
    println("After swap:")
    println("Number 1 :$number1")
    println("Number 2 :$number2")
}