package _1_general

fun main() {
    val inputNumber = 123
    val result = reverseInteger(inputNumber)
    println("Reverse of $inputNumber is $result")
}

private fun reverseInteger(input: Int): Int {
    var number = input
    var reminder: Int
    var result = 0
    while (number != 0) {
        reminder = number % 10
        result = (result * 10) + reminder
        number /= 10
    }
    return if (result < Int.MIN_VALUE || result > Int.MAX_VALUE) {
        0
    } else {
        result
    }
}