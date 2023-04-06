package _1_general

fun main() {
    // printAllPrimeNumbers(50)
    val number = 10
    isPrimeNumber(number)
}

private fun printAllPrimeNumbers(limit: Int) {
    for (i in 1..limit) {
        var isPrime = true
        for (j in 2..i / 2) {
            if (i % j == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            println("$i is prime number")
        } else {
            println("$i")
        }
    }
}

private fun isPrimeNumber(number: Int): Boolean {
    for (i in 2..number / 2) {
        if (number % i == 0) {
            println("$number is not prime number")
            return false
        }
    }
    println("$number is prime number")
    return true
}