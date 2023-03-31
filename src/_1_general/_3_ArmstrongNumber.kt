package _1_general

fun main() {
    val number = 153
    println("$number is armstrong : ${isNumberArmStrong(number)}")
}

fun isNumberArmStrong(inputNumber: Int): Boolean {
    var number = inputNumber
    var sum = 0
    var reminder: Int
    while (number > 0) {
        reminder = number % 10
        sum += (reminder * reminder * reminder)
        number /= 10
    }
    return sum == inputNumber
}