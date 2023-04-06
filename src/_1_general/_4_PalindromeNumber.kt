package _1_general

fun main() {
    val inputNumber = 121
    println("$inputNumber is palindrome: ${isNumberPalindrome(inputNumber)}")
}

private fun isNumberPalindrome(input: Int): Boolean {
    var number = input
    var reminder: Int
    var result = 0
    while (number != 0) {
        reminder = number % 10
        result = (result * 10) + reminder
        number /= 10
    }
    return input == result
}