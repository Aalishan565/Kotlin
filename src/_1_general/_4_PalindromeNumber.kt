package _1_general

fun main() {
    val inputNumber = 121
    val result = reverseInteger(inputNumber)
    println("$inputNumber is palindrome: ${isNumberPalindrome(inputNumber)}")
}

fun isNumberPalindrome(input: Int): Boolean {
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